import java.util.Scanner;

public class GrazedGrains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[][] circles = new double[n][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++)
                circles[i][j] = scan.nextInt();
        }
        System.out.println(totalArea(circles, 10));
    }

    // I copied ALL OF THIS from 
    // https://rosettacode.org/wiki/Total_circles_area#Java
    public static double totalArea(double[][] circs, int d) {
        double maxx = Double.NEGATIVE_INFINITY;
        double minx = Double.POSITIVE_INFINITY;
        double maxy = Double.NEGATIVE_INFINITY;
        double miny = Double.POSITIVE_INFINITY;
        // Find the extremes of x and y for this set of circles.
        for (double[] circ : circs) {
            if (circ[0] + circ[2] > maxx) {
                maxx = circ[0] + circ[2];
            }
            if (circ[0] - circ[2] < minx) {
                minx = circ[0] - circ[2];
            }
            if (circ[1] + circ[2] > maxy) {
                maxy = circ[1] + circ[2];
            }
            if (circ[1] - circ[2] < miny) {
                miny = circ[1] - circ[2];
            }
        }
        double[] rect = { minx, maxy, maxx - minx, maxy - miny };
        surelyOutside = new boolean[circs.length];
        return totalArea(rect, circs, d);
    }

    private static double distSq(double x1, double y1, double x2, double y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    private static boolean rectangleFullyInsideCircle(double[] rect, double[] circ) {
        double r2 = circ[2] * circ[2];
        // Every corner point of rectangle must be inside the circle.
        return distSq(rect[0], rect[1], circ[0], circ[1]) <= r2
                && distSq(rect[0] + rect[2], rect[1], circ[0], circ[1]) <= r2
                && distSq(rect[0], rect[1] - rect[3], circ[0], circ[1]) <= r2
                && distSq(rect[0] + rect[2], rect[1] - rect[3], circ[0], circ[1]) <= r2;
    }

    private static boolean rectangleSurelyOutsideCircle(double[] rect, double[] circ) {
        // Circle center point inside rectangle?
        if (rect[0] <= circ[0] && circ[0] <= rect[0] + rect[2] && rect[1] - rect[3] <= circ[1] && circ[1] <= rect[1]) {
            return false;
        }
        // Otherwise, check that each corner is at least (r + Max(w, h)) away from
        // circle center.
        double r2 = circ[2] + Math.max(rect[2], rect[3]);
        r2 = r2 * r2;
        return distSq(rect[0], rect[1], circ[0], circ[1]) >= r2
                && distSq(rect[0] + rect[2], rect[1], circ[0], circ[1]) >= r2
                && distSq(rect[0], rect[1] - rect[3], circ[0], circ[1]) >= r2
                && distSq(rect[0] + rect[2], rect[1] - rect[3], circ[0], circ[1]) >= r2;
    }

    private static boolean[] surelyOutside;

    private static double totalArea(double[] rect, double[][] circs, int d) {
        // Check if we can get a quick certain answer.
        int surelyOutsideCount = 0;
        for (int i = 0; i < circs.length; i++) {
            if (rectangleFullyInsideCircle(rect, circs[i])) {
                return rect[2] * rect[3];
            }
            if (rectangleSurelyOutsideCircle(rect, circs[i])) {
                surelyOutside[i] = true;
                surelyOutsideCount++;
            } else {
                surelyOutside[i] = false;
            }
        }
        // Is this rectangle surely outside all circles?
        if (surelyOutsideCount == circs.length) {
            return 0;
        }
        // Are we deep enough in the recursion?
        if (d < 1) {
            return rect[2] * rect[3] / 3; // Best guess for overlapping portion
        }
        // Throw out all circles that are surely outside this rectangle.
        if (surelyOutsideCount > 0) {
            double[][] newCircs = new double[circs.length - surelyOutsideCount][3];
            int loc = 0;
            for (int i = 0; i < circs.length; i++) {
                if (!surelyOutside[i]) {
                    newCircs[loc++] = circs[i];
                }
            }
            circs = newCircs;
        }
        // Subdivide this rectangle recursively and add up the recursively computed
        // areas.
        double w = rect[2] / 2; // New width
        double h = rect[3] / 2; // New height
        double[][] pieces = { { rect[0], rect[1], w, h }, // NW
                { rect[0] + w, rect[1], w, h }, // NE
                { rect[0], rect[1] - h, w, h }, // SW
                { rect[0] + w, rect[1] - h, w, h } // SE
        };
        double total = 0;
        for (double[] piece : pieces) {
            total += totalArea(piece, circs, d - 1);
        }
        return total;
    }

}

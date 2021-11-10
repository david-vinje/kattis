import java.util.Scanner;

public class JointJogJam {
    public static void main(String[] args) {
        // sqrt((1-2)^2+(1-2)^2)
        Scanner scan = new Scanner(System.in);
        int kariStartX = scan.nextInt(), kariStartY = scan.nextInt();
        int olaStartX = scan.nextInt(), olaStartY = scan.nextInt();
        int kariEndX = scan.nextInt(), kariEndY = scan.nextInt();
        int olaEndX = scan.nextInt(), olaEndY = scan.nextInt();

        double dist1 = Math.sqrt((kariStartX-olaStartX)*(kariStartX-olaStartX) + (kariStartY-olaStartY)*(kariStartY-olaStartY));
        double dist2 = Math.sqrt((kariEndX-olaEndX)*(kariEndX-olaEndX) + (kariEndY-olaEndY)*(kariEndY-olaEndY));

        System.out.println(Math.max(dist1, dist2));
    }
}

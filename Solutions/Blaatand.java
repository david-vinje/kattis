import java.util.Scanner;

public class Blaatand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""; char[] a;

        while (s.equals("")) {
            s = sc.nextLine();
        }

        boolean rightSideCanChew = true, leftSideCanChew = true;
        int rightUpperSideTeethMissing = 0, rightLowerSideTeethMissing = 0;
        int leftUpperSideTeethMissing = 0, leftLowerSideTeethMissing = 0;
        boolean isRightSide = false, isUpperJaw = false;

        for (int i=0; i<n; i++) {
            if (i!=0)
                s = sc.nextLine();
            a = s.toCharArray();

            if (a[0] == '-') {
                isUpperJaw = false;
                isRightSide = false;
            }
            else if (a[0] == '+') {
                isUpperJaw = true;
                isRightSide = false;
            }
            else if (a[1] == '-') {
                isUpperJaw = false;
                isRightSide = true;
            }
            else if (a[1] == '+') {
                isUpperJaw = true;
                isRightSide = true;
            } else {
                System.out.println("whoops");
            }
            
            if(isRightSide && a[3] == 'b')
                rightSideCanChew = false;
            else if (!isRightSide && a[3] == 'b')
                leftSideCanChew = false;

            if(isRightSide && isUpperJaw && a[3] == 'm')
                rightUpperSideTeethMissing++;
            else if (isRightSide && !isUpperJaw && a[3] == 'm')
                rightLowerSideTeethMissing++;
            else if (!isRightSide && isUpperJaw && a[3] == 'm')
                leftUpperSideTeethMissing++;
            else if (!isRightSide && !isUpperJaw && a[3] == 'm')
                leftLowerSideTeethMissing++;

            if (rightUpperSideTeethMissing > 7 || rightLowerSideTeethMissing > 7)
                rightSideCanChew = false;
            else if (leftUpperSideTeethMissing > 7 || leftLowerSideTeethMissing > 7)
                leftSideCanChew = false;
        }
        sc.close();
        if (rightSideCanChew) System.out.println("1");
        else if (leftSideCanChew) System.out.println("0");
        else System.out.println("2");
    }
}

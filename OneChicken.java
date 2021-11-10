import java.util.Scanner;

public class OneChicken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt(), D = N-M;
        if (D < -1)
            System.out.println("Dr. Chaz will have " + (-D) + " pieces of chicken left over!");
        else if (D==-1)
            System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
        else if (D > 1)
            System.out.println("Dr. Chaz needs "+D+" more pieces of chicken!");
        else 
            System.out.println("Dr. Chaz needs 1 more piece of chicken!");
    }
}

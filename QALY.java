import java.util.Scanner;

public class QALY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double QALY = 0;
        for (int i=0; i<N; i++) {
            // int a = scan.nextInt();
            // int b = scan.nextInt();
            QALY += scan.nextDouble()*scan.nextDouble();
        }
        System.out.println(QALY);
    }
}

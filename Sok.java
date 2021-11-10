import java.util.Scanner;

public class Sok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        double i = scan.nextInt(), j = scan.nextInt(), k = scan.nextInt();
        scan.close();

        double A = Math.max(Math.max(a-i / j*b, a-i / k*c), 0);
        double B = Math.max(Math.max(b - j / i * a, b - j / k * c), 0);
        double C = Math.max(Math.max(c - k / i * a, c - k / j * b), 0);

        System.out.println(A+" "+B+" "+C);        
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Kaninavl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n < 45)
            fib1(n);
        else if (n < 91)
            fib2(n);
        else
            fib3(n);
    }

    static void fib1(int n) {
        int f1 = 0, f2 = 1, temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(f2);
            temp = f1;
            f1 = f2;
            f2 = temp + f2;
        }
    }

    static void fib2(int n) {
        long f1 = 0, f2 = 1, temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(f2);
            temp = f1;
            f1 = f2;
            f2 = temp + f2;
        }
    }

    static void fib3(int n) {
        BigInteger f1 = new BigInteger("0");
        BigInteger f2 = new BigInteger("1");
        BigInteger tmp = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            System.out.println(f2);
            tmp = f1;
            f1 = f2;
            f2 = tmp.add(f2);
        }
    }
}

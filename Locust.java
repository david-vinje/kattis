import java.util.Scanner;

public class Locust {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] years = new int[k];
        int year = scan.nextInt();
        int lcm = lcm(scan.nextInt(), scan.nextInt());
        int min = lcm + year;
        for (int i = 0; i < k-1; i++) {
            year = scan.nextInt();
            lcm = lcm(scan.nextInt(), scan.nextInt());
            min = Math.min(min, lcm + year);
        }
        System.out.println(min);
    }

    // I copied the LCM and GCM methods from here:
    // https://www.baeldung.com/java-least-common-multiple
    static int gcd(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return number1 + number2;
        } else {
            int absNumber1 = Math.abs(number1);
            int absNumber2 = Math.abs(number2);
            int biggerValue = Math.max(absNumber1, absNumber2);
            int smallerValue = Math.min(absNumber1, absNumber2);
            return gcd(biggerValue % smallerValue, smallerValue);
        }
    }

    static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0)
            return 0;
        else {
            int gcd = gcd(number1, number2);
            return Math.abs(number1 * number2) / gcd;
        }
    }
}

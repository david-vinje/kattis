import java.util.Scanner;

public class Gennemsnitsvaegt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double gnms = 0;
        int vaegt = 0;
        int count = 0;
        while (scan.hasNextInt()) {
            vaegt = scan.nextInt();
            if (vaegt > 2000 || vaegt < 10) {
                if (scan.hasNextInt()) 
                    scan.nextInt();
            } else {
                gnms += vaegt;
                count++;
            }
        }
        System.out.println(gnms / (count));
    }

    static void gnmsVaegt() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double gnms = 0;
        int vaegt = 0;
        int i = 0;
        while (i < n) {
            vaegt = scan.nextInt();
            if (vaegt > 2000 || vaegt < 10) {
                scan.nextInt();
                n--;
            } else {
                gnms += vaegt;
            }
            i++;
        }
        System.out.println(gnms / (n - 1));
    }
}

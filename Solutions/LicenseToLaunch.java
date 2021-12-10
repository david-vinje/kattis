import java.util.Arrays;
import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine())-1;
        long min = Long.MAX_VALUE;
        int indx = 0;
        for (int i=0; i<k; i++) {
            long n = scan.nextLong();
            if (n<min) {
                indx = i;
                min = n;
            }
        }
        System.out.println(indx);
    }
}

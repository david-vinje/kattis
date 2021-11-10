import java.util.Scanner;
import java.util.Arrays;

public class HotHike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] temps = new int[n];
        int max = 0;
        
        // Read the temperatures
        for (int i = 0; i < n; i++) {
            temps[i] = scan.nextInt();
            max = Math.max(temps[i], max);
        }

        // Find the min max
        int index = 1;
        for (int i = 0; i < n-2; i++) {
            if (Math.max(temps[i], temps[i+2]) < max) {
                max = Math.max(temps[i], temps[i+2]);
                index = i+1;
            }
        }
        System.out.println(index + " " + max);
    }
}
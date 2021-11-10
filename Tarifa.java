import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int j = scan.nextInt();
        int sum = k;
        for (int i=0; i<j; i++) {
            sum += k-scan.nextInt();
        }
        System.out.println(sum);
    }
}

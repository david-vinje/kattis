import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0, num = 0;
        for (int i=0; i<n; i++) {
            num = scan.nextInt();
            sum += Math.pow(num/10, num%10);
        }
        System.out.println(sum);
    }
}
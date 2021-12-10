import java.util.Scanner;

public class CinemaCrowds2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), k = scan.nextInt();
        while (n-k >= 0) {
            m--;
            n -= k;
            k = scan.nextInt();
        } 
        System.out.println(m);
    }
}

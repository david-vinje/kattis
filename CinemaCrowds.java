import java.util.Scanner;

public class CinemaCrowds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int count = 0;
        for (int i = 0; i < m; i++) {
            int k = scan.nextInt();
            if (n >= k) {
                n -= k;
            } else {
                count ++;
            }
        }
        System.out.println(count);
    }
}

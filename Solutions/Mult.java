import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int first = scan.nextInt();
        for (int i = 1; i < k; i++) {
            int next = scan.nextInt();
            if (next % first == 0) {
                System.out.println(next);
                first = scan.nextInt();
                i++;
            }
        }
    }
}

import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i=0; i<n; i++) {
            String line = scan.nextLine();
            if (i%2==0) {
                System.out.println(line);
            }
        }
        scan.close();
    }
}

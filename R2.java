import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R1 = scan.nextInt(), S = scan.nextInt();
        System.out.println(2*S-R1);
        scan.close();
    }
}
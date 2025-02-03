import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i=1; i<=k; i++) {
            System.out.println(i+" Abracadabra");
        }
    }
}

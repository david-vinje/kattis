import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), I = scan.nextInt();
        System.out.println(A*(I-1)+1);
        scan.close();
    }
}

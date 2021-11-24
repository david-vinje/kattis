import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int count = 0;
        for (int i=0; i<k; i++) {
            if (scan.nextInt() < 0)
                count++;
        }
        System.out.println(count);
    }
}

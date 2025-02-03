import java.util.Scanner;

public class TurnItUp {
    public static void main(String[] args) {
        int val = 7;
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < k; i++) {
            String s = scan.nextLine();
            val += val<10 && s.equals("Skru op!") ? 1 : (val>0 && s.equals("Skru ned!") ? -1 : 0);
        }
        System.out.println(val);
    }
}
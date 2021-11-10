import java.util.Scanner;

public class LineThemUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(); scan.nextLine();
        String[] kids = new String[k];
        for (int i=0; i<k; i++) {
            kids[i] = scan.nextLine();
        }
        boolean increasing = false, decreasing = false;
        for (int i=0; i<k-1; i++) {
            int letter = 0;
            int k1 = (int) kids[i].substring(0).charAt(letter);
            int k2 = (int) kids[i+1].substring(0).charAt(letter);
            while (k1 == k2) {
                letter++;
                k1 = (int) kids[i].substring(0).charAt(letter);
                k2 = (int) kids[i + 1].substring(0).charAt(letter);
            }
            if (k1 < k2) increasing = true;
            else decreasing = true;
        }
        if (increasing && decreasing)
            System.out.println("NEITHER");
        else if (increasing)
            System.out.println("INCREASING");
        else if (decreasing)
            System.out.println("DECREASING");
    }
}

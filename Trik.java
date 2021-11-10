import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        int i = 1;
        char[] s = new Scanner(System.in).nextLine().toCharArray();
        for (char letter : s) {
            if (i==1 && letter == 'A') i++;
            else if (i==2 && letter == 'A') i--;
            else if (i==2 && letter == 'B') i++;
            else if (i==3 && letter == 'B') i--;
            else if (i==3 && letter == 'C') i=1;
            else if (i==1 && letter == 'C') i=3;
        }
        System.out.println(i);
    }
}

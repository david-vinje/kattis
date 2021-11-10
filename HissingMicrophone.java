import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letters = scan.nextLine().toCharArray();
        for (int i=0; i<letters.length-1; i++) {
            if (letters[i]=='s' && letters[i+1]=='s') {
                System.out.println("hiss");
                return;
            }
        } 
        System.out.println("no hiss");
    }
}

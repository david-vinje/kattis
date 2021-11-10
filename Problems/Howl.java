import java.util.Scanner;

public class Howl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("A".repeat(s.length())+"HOW");
    }
}

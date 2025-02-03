import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] date = scan.nextLine().split(" ");
        if (date[0].equals("OCT") && date[1].equals("31")) {
            System.out.println("yup");
        } else if (date[0].equals("DEC") && date[1].equals("25")) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
        scan.close();
    }
}

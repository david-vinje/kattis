import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var names = scan.nextLine().split("-");
        var initials = "";
        for (var name : names) {
            initials += name.substring(0, 1);
        }
        System.out.println(initials);
    }
}

import java.util.Scanner;

public class EyeOfSauron {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        int i = line.indexOf("(")+1;
        if (line.substring(0,i).length() != line.substring(i).length()) {
            System.out.println("fix");
        } else {
            System.out.println("correct");
        }
    }
}

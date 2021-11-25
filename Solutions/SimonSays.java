import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i=0; i<k; i++) {
            String line = scan.nextLine();
            if (line.contains("Simon says ")) {
                System.out.println(line.substring(10));
            }
        }
    }
}
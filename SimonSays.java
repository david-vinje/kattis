import java.util.Scanner;

public class SimonSays {
    private static final String SIMON_SAYS = "simon says";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i=0; i<k; i++) {
            String line = scan.nextLine();
            if (line.contains(SIMON_SAYS) && line.length()>SIMON_SAYS.length()) {
                System.out.println(line.substring(SIMON_SAYS.length()+1));
            } else {
                System.out.println("");
            }
        }
    }
}
import java.util.Scanner;

public class Stalden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ind = 0, ud = 0;
        String s = ""; boolean running = true;
        while (running) {
            //while (scan.hasNextLine()) {
                s = scan.nextLine();
                if (s.equals("Får ind")) {
                    ind++;
                    if (ud > 0)
                        ud--;
                } else if (s.equals("Får ud")) {
                    ud++;
                    if (ind > 0)
                        ind--;
                }
                if (s.equals(""))
                    running = false;
            //}
        }
        scan.close();
        System.out.println(ind + ud);
    }
}
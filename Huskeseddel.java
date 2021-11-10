import java.util.Scanner;

public class Huskeseddel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin = scan.nextInt(); scan.close();
        String s = ""; pin++;
        for (int i=0; i<4; i++) {
            s += (int) (pin / Math.pow(10, i) % 10);
        }
        System.out.println(s);
    } 
}

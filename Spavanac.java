import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt(), M = scan.nextInt();
        // int d = Math.abs(M-45);
        int d = M-45;
        if (d<0) {
            M = 60+d;
            H--;
            if(H<0) {
                H = 23;
            }
        } else {
            M = d;
        }
        System.out.println(H+" "+M);
    }
}

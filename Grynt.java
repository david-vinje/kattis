import java.util.Scanner;

public class Grynt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.close();
        for (int i=1; i<=n; i++) {
            if (i%3==0 && i%5==0)
                System.out.println("øfgrynt");
            else if (i % 3 == 0) 
                System.out.println("øf");
            else if (i % 5 == 0) 
                System.out.println("grynt");
            else 
                System.out.println(i%100);
        }
    }
}

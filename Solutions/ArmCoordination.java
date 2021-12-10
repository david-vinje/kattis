import java.util.Scanner;

public class ArmCoordination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt(), r = scan.nextInt();
        System.out.println((-r+x)+" "+(r+y));
        System.out.println((r+x)+" "+(r+y));
        System.out.println((r+x)+" "+(-r+y));
        System.out.println((-r+x)+" "+(-r+y));
    }   
}
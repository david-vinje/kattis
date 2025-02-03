import java.util.Scanner;

public class Kornsilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble(), K = sc.nextDouble(), H = sc.nextDouble(); 
        sc.close();
        
        double d = (N-K*H);
        if (d < 0) d = 0;
        else d = Math.ceil(d/H);
        System.out.println((int)d);
    }
}
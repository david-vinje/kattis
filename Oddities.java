import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scna = new Scanner(System.in);
        int k = scna.nextInt();
        for (int i=0; i<k; i++) {
            int a = scna.nextInt();
            if (a%2 == 0) System.out.println(a+" is even");
            else System.out.println(a+" is odd");
        }
    }
}

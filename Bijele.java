import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] n = {1,1,2,2,2,8};
        for (int i=0; i<n.length; i++) {
            System.out.print(n[i]-scn.nextInt()+" ");
        }
    }
}

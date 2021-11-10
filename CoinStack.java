import java.util.Scanner;

public class CoinStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int[] stacks = new int[n];
        for (int i = 0; i < n; i++) {
            stacks[i] = scan.nextInt();
            sum += stacks[i];
        }
        if (sum % 2 != 0) {
            System.out.println("no");
            return;
        }
        for (int stack : stacks) {
            if (stack > (sum-stack)) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        while (true) {
            int max = 0, ind1 = 0, ind2 = 0;
            for (int i=0; i<n; i++) {
                if (stacks[i] > max) {
                    max = stacks[i];
                    ind1 = i;
                }
            }
            if (max == 0) return;
            max = 0; 
            for (int i=0; i<n; i++) {
                if (i != ind1 && stacks[i] > max) {
                    max = stacks[i];
                    ind2 = i;
                }
            }
            stacks[ind1]--;
            stacks[ind2]--;
            System.out.println((ind1+1) + " " + (ind2+1));
        }
    }
}

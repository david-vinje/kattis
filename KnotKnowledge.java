import java.util.Scanner;

public class KnotKnowledge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] knots = new int[n];
        int[] knotsLearned = new int[n - 1];
        for (int i=0; i<n; i++)
            knots[i] = scan.nextInt();
        for (int i=0; i<n-1; i++)
            knotsLearned[i] = scan.nextInt();  
         
        for (int i=0; i<n; i++) {
            boolean knotLearned = false;
            for (int j=0; j<n-1; j++) {
                if (knots[i] == knotsLearned[j])
                    knotLearned = true;
            }
            if (!knotLearned) {
                System.out.println(knots[i]);
                return;
            }
        }
    }
}
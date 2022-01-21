import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int t = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();
        switch (t) {
            case 1:
                System.out.println("7");
                break;
            case 2:
                if (A[0] > A[1])
                    System.out.println("Bigger");
                else if (A[0] == A[1])
                    System.out.println("Equal");
                else
                    System.out.println("Smaller");
                break;
            case 3:
                long[] sorted = { A[0], A[1], A[2] };
                Arrays.sort(sorted);
                System.out.println(sorted[1]);
                break;
            case 4:
                long sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += A[i];
                }
                System.out.println(sum);
                break;
            case 5:
                long evenSum = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] % 2 == 0)
                        evenSum += A[i];
                }
                System.out.println(evenSum);
                break;
            case 6:
                StringBuilder sb = new StringBuilder();
                int a = 'a';
                for (int i = 0; i < N; i++) {
                    // char ch = (char) (a+A[i]%26);
                    sb.append((char) (a+A[i]%26));
                }
                System.out.println(sb.toString());
                break;
            default:
                int i = 0;
                int[] visited = new int[N];
                while (true) {
                    i = A[i];
                    if (i > N - 1) {
                        System.out.println("Out");
                        break;
                    }
                    if (i == N - 1) {
                        System.out.println("Done");
                        break;
                    }
                    if (visited[i] == 1) {
                        System.out.println("Cyclic");
                        break;
                    }
                    visited[i] = 1;
                }
                break;
        }
    }
}

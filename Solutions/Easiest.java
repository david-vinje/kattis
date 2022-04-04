import java.util.ArrayDeque;
import java.util.Deque;

public class Easiest {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int N = scan.getInt();
        while (N != 0) {
            int p = 10;
            while (findSum(N) != findSum(++p * N));
            scan.append(p+"\n");
            N = scan.getInt();
        }
        scan.flush();
    }

    public static int findSum(int N) {
        int sum = 0;
        char[] arr = Integer.toString(N).toCharArray();
        for (char ch : arr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
}

import java.util.ArrayDeque;
import java.util.Deque;

public class EvenUpSolitare {
    // Got inspired by PeterBeattie19 on Github:
    // https://github.com/PeterBeattie19/Kattis/blob/master/EvenUpSolitaire.py
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in, System.out);
        int k = scan.getInt();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            int n = scan.getInt();
            if (!stack.isEmpty() && (stack.peek() + n) % 2 == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        System.out.println(stack.size());
    }
}
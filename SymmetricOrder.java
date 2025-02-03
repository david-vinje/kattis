import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SymmetricOrder {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int k = scan.getInt(), count = 0;
        while (k != 0) {
            scan.append("SET " + (++count) + "\n");
            Deque<String> stack = new ArrayDeque<>();
            for (int i = 0; i < k / 2; i++) {
                scan.append(scan.getWord() + "\n");
                stack.push(scan.getWord());
            }
            if (k%2 != 0)
                scan.append(scan.getWord()+"\n");
            for (String name : stack) {
                scan.append(name + "\n");
            }
            k = scan.getInt();
        }
        scan.flush();
    }
}

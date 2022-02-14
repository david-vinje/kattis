import java.util.ArrayDeque;
import java.util.Deque;

public class GameOfThrowns {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in, System.out);
        int n = scan.getInt(); 
        int k = scan.getInt();
        int pos = 0;
        Deque<Integer> children = new ArrayDeque<>();
        children.push(0);
        for (int j = 0; j < k; j++) {
            String word = scan.getWord();
            if (word.equals("undo")) {
                int m = scan.getInt();
                for (int l = 0; l < m; l++) {
                    if (!children.isEmpty())
                        children.pop();
                }
                pos = children.isEmpty() ? 0 : children.peek();
            } else {
                int i = Integer.parseInt(word);
                if (i%n != 0) {
                    // Got the formula from JonSteinn at line 14:
                    // https://github.com/JonSteinn/Kattis-Solutions/blob/master/src/Game%20of%20Throwns/C/main.c
                    pos += (1001*n + i);
                    pos %= n;
                }
                children.push(pos);
            }
        }
        System.out.println(children.isEmpty() ? 0 : children.pop());
    }
}
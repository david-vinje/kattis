import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheGrandAdventure {
    static Deque<Character> stack;
    static Map<Character, Character> map;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        map = new HashMap<>();
        map.put('t', '|');
        map.put('b', '$');
        map.put('j', '*');
        for (int i = 0; i < n; i++) {
            stack = new ArrayDeque<>();
            String line = scan.nextLine();
            if (adventure(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean adventure(String line) {
        for (char c : line.toCharArray()) {
            if (c == '.')
                continue;
            if (c == '$' || c == '*' || c == '|') {
                stack.push(c);
            } else if (stack.isEmpty() || map.get(c) != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

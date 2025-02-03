import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PairingSocks {
    public static void main(String[] args) {
        Deque<Integer> pile = new ArrayDeque<>();
        Deque<Integer> aux = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i=0; i<k*2; i++) {
            pile.push(scan.nextInt());
        }
        int count = 0; 
        while (!pile.isEmpty()) {
            aux.push(pile.pop());
            while(!pile.isEmpty() && !aux.peek().equals(pile.peek())) {
                aux.push(pile.pop());
            }
            while (aux.peek().equals(pile.peek()) ) {
                aux.pop(); 
                pile.pop();
                count += 2;
                if (pile.isEmpty() || aux.isEmpty()) {
                    break;
                }
            }
        }
        if (!(pile.isEmpty() && aux.isEmpty())) {
            System.out.println("impossible");
        } else {
            System.out.println(count);
        }
    }
}
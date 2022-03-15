import java.util.Collections;
import java.util.PriorityQueue;

public class FallingApart {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int k = scan.getInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(scan.getInt());
        }
        int a = 0, b = 0;
        while (pq.size() > 1) {
            a += pq.poll();
            b += pq.poll();
        }
        if (pq.size() == 1) a += pq.poll();
        System.out.println(a+" "+b);
    }
}

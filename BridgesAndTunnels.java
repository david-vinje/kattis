import java.util.HashMap;
import java.util.Map;

public class BridgesAndTunnels {
    static Map<String, String> bridges;
    static Map<String, Integer> rank;

    public static void main(String[] args) {
        Kattio kattio = new Kattio(System.in, System.out);
        bridges = new HashMap<>();
        rank = new HashMap<>();
        int k = kattio.getInt();
        for (int i = 0; i < k; i++) {
            String b1 = kattio.getWord();
            String b2 = kattio.getWord();
            // Update bridges (if needed) and find root
            String B1 = update(b1);
            String B2 = update(b2);
            // Union bridges
            if (!B1.equals(B2)) {
                union(B1, B2);
            }
            // Compute bridge length
            System.out.println(Math.max(rank.get(B1), rank.get(B2)));
        }
    }

    public static String update(String b) {
        if (bridges.containsKey(b)) {
            return find(bridges.get(b));
        } 
        rank.put(b, 1);
        bridges.put(b, b);
        return b;
    }

    public static void union(String B1, String B2) {
        if (rank.get(B1) > rank.get(B2)) {
            rank.put(B1, rank.get(B1)+rank.get(B2));
            bridges.put(B2, B1);
        } else {
            rank.put(B2, rank.get(B1)+rank.get(B2));
            bridges.put(B1, B2);
        }
    }

    public static String find(String b) {
        while (!b.equals(bridges.get(b))) {
            bridges.put(bridges.get(b), bridges.get(bridges.get(b)));
            b = bridges.get(b);
        }
        return b;
    }
}

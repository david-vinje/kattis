import java.io.IOException;

public class UnionFind {
    static int[] id;
    static int[] rank;

    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1024);
        // PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out, 1024));
        // String[] line = reader.readLine().split(" ");
        // int n = Integer.parseInt(line[0]);
        // int k = Integer.parseInt(line[1]);
        Kattio scan = new Kattio(System.in, System.out);
        int n = scan.getInt();
        int k = scan.getInt();
        id = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            rank[i] = 1;
        }
        for (int i = 0; i < k; i++) {
            // line = reader.readLine().split(" ");
            // char q = line[0].charAt(0);
            // int A = find(Integer.parseInt(line[1]));
            // int B = find(Integer.parseInt(line[2]));
            char q = scan.getWord().charAt(0);
            int A = find(scan.getInt());
            int B = find(scan.getInt());
            if (q == '?') {
                // writer.append((A == B ? "yes" : "no")+"\n");
                scan.append((A == B ? "yes" : "no")+"\n");
            } else if (A != B) {
                union(A, B);
            }
        }
        // writer.flush();
        scan.flush();
    }

    public static void union(int S, int T) {
        if (rank[S] > rank[T]) {
            rank[S] += rank[T];
            id[T] = S;
        } else {
            rank[T] += rank[S];
            id[S] = T;
        }
    }

    public static int find(int p) {
        while (p != id[p]) {
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
}
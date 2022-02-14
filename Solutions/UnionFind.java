public class UnionFind {
    static int[] id;
    static int[] rank;

    public static void main(String[] args) {
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
            char q = scan.getWord().charAt(0);
            int A = find(scan.getInt());
            int B = find(scan.getInt());
            if (q == '?') {
                scan.append(A==B ? "yes" : "no");
                scan.append("\n");
            } else if (A != B) {
                union(A, B);
            }
        }
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
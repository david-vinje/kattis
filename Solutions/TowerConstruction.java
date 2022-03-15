public class TowerConstruction {
    public static void main(String[] args) {
        Kattio kattio = new Kattio(System.in);
        int k = kattio.getInt();
        int current = kattio.getInt(), count = 1;
        for (int i = 0; i < k-1; i++) {
            int next = kattio.getInt();
            if (next > current) {
                count++;
            }
            current = next;
        }
        System.out.println(count);
    }
}
public class FridayThe13th {
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int T = scan.getInt();
        for (int t = 0; t < T; t++) {
            int D = scan.getInt(), M = scan.getInt();
            int weekday = 0, fridays = 0;
            for (int m = 0; m < M; m++) {
                int d = scan.getInt();
                if (d > 12 && weekday == 0) 
                    fridays++;
                weekday = (d + weekday) % 7;
            }
            scan.append(fridays + "\n");
        }
        scan.flush();
    }
}

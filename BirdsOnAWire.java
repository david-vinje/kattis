import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirdsOnAWire {
    public static void main(String[] args) {
        List<Integer> birds = new ArrayList<>();
        Kattio scan = new Kattio(System.in);
        int l = scan.getInt(), d = scan.getInt(), n = scan.getInt();
        for (int i = 0; i < n; i++) {
            birds.add(scan.getInt());
        }
        if (n > 0) {
            Collections.sort(birds);
            int diff = birds.get(0) - 6;
            int count = diff < 0 ? 0 : (diff) / d;
            for (int i = 0; i < birds.size() - 1; i++) {
                diff = birds.get(i + 1) - birds.get(i);
                count += diff / d > 0 ? (diff) / d - 1 : 0;
            }
            count += ((l - 6) - birds.get(birds.size() - 1)) / d;
            System.out.println(count);
        } else {
            System.out.println((l-12)/d+1);
        }
    }

}

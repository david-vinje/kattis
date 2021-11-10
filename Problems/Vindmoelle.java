import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vindmoelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(); sc.close();
        int dist = b-a;
        if (dist < 0) dist += 360;
        if (dist > 180) dist -= 360;
        System.out.println(dist);

        List<String> l = new ArrayList<>();
        l.add("Hello, "); l.add("World!");
        System.out.print(l.get(0));
        System.out.println(l.get(1));
    }
}

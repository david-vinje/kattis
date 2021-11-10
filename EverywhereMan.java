import java.util.HashSet;
import java.util.Scanner;

public class EverywhereMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        for (int i=0; i<k; i++) {
            HashSet<String> places = new HashSet<>();
            int n = Integer.parseInt(scan.nextLine());
            for (int j=0; j<n; j++) {
                places.add(scan.nextLine());
            }
            System.out.println(places.stream().count());
        }
    }
}

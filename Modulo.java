import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        for (int i=0; i<10; i++) {
            nums.add(scan.nextInt()%42);
        }
        scan.close();
        System.out.println(nums.size());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] words = new Scanner(System.in).nextLine().split(" ");
        for (String word : words) {
            if (!list.contains(word))
                list.add(word);
            else {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
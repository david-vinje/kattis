import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KeysPhoneWallet {
  public static void main(String[] args) {
    List<String> essentials = Arrays.asList("keys", "phone", "wallet");
    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    List<String> items = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String item = scan.nextLine();
      items.add(item);
    }
    List<String> missing = essentials
      .stream()
      .filter(item -> !items.contains(item))
      .toList();
    if (missing.isEmpty()) {
      System.out.println("ready");
    } else {
      for (String item : missing) {
        System.out.println(item);
      }
    }
  }
}

import java.util.HashMap;
import java.util.Map;

public class Relocation {
  public static void main(String[] args) {
    Kattio kattio = new Kattio(System.in);
    int n = kattio.getInt();
    int q = kattio.getInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      map.put(i, kattio.getInt());
    }
    while (q-- > 0) {
      if (kattio.getInt() == 1) {
        map.put(kattio.getInt(), kattio.getInt());
      } else {
        int a = map.get(kattio.getInt());
        int b = map.get(kattio.getInt());
        kattio.append(Math.abs(a-b) + "\n");
      }
    }
    kattio.flush();
  }
}
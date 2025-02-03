import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakkFyrirMig {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    for (int i = 0; i < n; i++) {
      String name = reader.readLine();
      System.out.println("Takk " + name);
    }
  }
}

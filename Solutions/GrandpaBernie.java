import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrandpaBernie {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(reader.readLine());
    Map<String, List<Integer>> trips = new HashMap<>();
    while (n-- > 0) {
      String[] line = reader.readLine().split(" ");
      String place = line[0];
      List<Integer> years;
      if (trips.containsKey(place)) {
        years = trips.get(place);
      } else {
        years = new ArrayList<>();
      }
      years.add(Integer.parseInt(line[1]));
      trips.put(place, years);
    }
    for (List<Integer> years : trips.values()) {
      Collections.sort(years);
    }
    int q = Integer.parseInt(reader.readLine());
    while (q-- > 0) {
      String[] line = reader.readLine().split(" ");
      int pos = Integer.parseInt(line[1]) - 1;
      List<Integer> years = trips.get(line[0]);
      writer.write(years.get(pos) + "\n");
    }
    writer.flush();
  }
}
import java.util.Arrays;
import java.util.Scanner;

public class Cudoviste {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] line = scanner.nextLine().split(" ");
    int r = Integer.parseInt(line[0]), c = Integer.parseInt(line[1]);
    char[][] map = new char[r][c];
    for (int i = 0; i < r; i++) {
      char[] chars = scanner.nextLine().toCharArray();
      for (int j = 0; j < c; j++) {
        map[i][j] = chars[j];
      }
    }
    scanner.close();
    int[] cars = new int[5];
    for (int i = 0; i < r-1; i++) {
      for (int j = 0; j < c-1; j++) {
        if (map[i][j] == '#' || map[i+1][j] == '#' || map[i][j+1] == '#' || map[i+1][j+1] == '#') {
          // no park
          continue;
        }
        int count = 0;
        if (map[i][j] == 'X') count++;
        if (map[i+1][j] == 'X') count++;
        if (map[i][j+1] == 'X') count++;
        if (map[i+1][j+1] == 'X') count++;
        cars[count]++;
      }
    }
    Arrays.stream(cars).forEach(x -> System.out.println(x));
  }
}

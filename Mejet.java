import java.util.Scanner;
import java.util.ArrayList;

public class Mejet {
    public static void main(String[] args) {
        // west = 0; north = 1; east = 2; south = 3;
        char[][] marken = new char[200][200];
        int x = 0, y = 0;
        for (int i = 0; i < 200; i++)
            for (int j = 0; j < 200; j++)
                marken[j][i] = ' ';
        marken[0][0] = '#';

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();

        int direction = 1;
        char[] directions = line.toCharArray();
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == '^') {
                if (direction == 0)
                    x = x < 0 ? x-- : 199;
                else if (direction == 1)
                    y = y < 0 ? y-- : 199;
                else if (direction == 2)
                    x++;
                else
                    y++;
                marken[x][y] = '#';
            } else if (directions[i] == '<')
                direction--;
            else
                direction++;
            direction %= 4;
        }
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 200; j++) {
                if (marken[j][i] == '#')
                    sb.append('#');
                else
                    sb.append(' ');
            }
            line = sb.toString();
            if (line.contains("#"))
                lines.add(line);
        }
        for (String l : lines)
            System.out.print(l.trim() + '@');
        System.out.println();
    }
}
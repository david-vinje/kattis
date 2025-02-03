import java.util.Scanner;

public class DeceptiveDirections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt(), h = scan.nextInt(); 
        int x = 0, y = 0; 
        char[][] map = new char[h][w];
        for (int i=0; i<h; i++) {
            String s = scan.nextLine();
            while (s.equals("")) 
                s = scan.nextLine();
            char[] a = s.toCharArray();
            for (int j=0; j<w; j++) {
                map[i][j] = a[j];
                if (map[i][j] == 'S') {
                    y = i;
                    x = j;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        char[][] tempMap = map;
        char[] dir = scan.nextLine().toCharArray();
        boolean walkable = true;
        while (walkable) {
            for (int i=0; i<dir.length; i++) {
                boolean walking = true;
                while (walking) {
                    if (dir[i] == 'E') tempMap[y][x+1] = '#';
                    else if (dir[i] == 'W') tempMap[y][x-1] = '#';
                    else if (dir[i] == 'N') tempMap[y-1][x] = '#';
                    else if (dir[i] == 'S') tempMap[y+1][x+1] = '#';
                    if (tempMap[y+1][x] == '.') {
                        tempMap[y][x] = '#';
                        y++; 
                    } else if (tempMap[y-1][x] == '.') {
                        tempMap[y][x] = '#';
                        y--;
                    } else if (tempMap[y][x+1] == '.') {
                        tempMap[y][x] = '#';
                        x++;
                    } else if (tempMap[y][x-1] == '.') {
                        tempMap[y][x] = '#';
                        x--;
                    } else {
                        tempMap[x][y] = '!';
                        map[x][y] = '!';
                        walking = false;
                    }
                }
            }
        }
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
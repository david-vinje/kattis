import java.util.Scanner;

public class NineKnights {
    public static void main(String[] args) {
        int n = 5;
        Scanner scan = new Scanner(System.in);
        char[][] board = new char[n][n];
        int count = 0;
        for (int i=0; i<n; i++) {
            char[] line = scan.nextLine().toCharArray();
            for (int j=0; j<n; j++) {
                board[i][j] = line[j];
                if (line[j] == 'k')
                    count++;
            }
        }
        if (count != 9) {
            System.out.println("invalid");
            return;
        }
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 'k') {
                    if (j+2<n) {
                        if (board[i+1][j+2] == 'k') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                    if (j-2>=0) {
                        if (board[i+1][j-2] == 'k') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                    if (i+2<n && j+1<n) {
                        if (board[i+2][j+1] == 'k') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                    if (i+2<n && j-1>=0) {
                        if (board[i+2][j-1] == 'k') {
                            System.out.println("invalid");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("valid");
    }
}

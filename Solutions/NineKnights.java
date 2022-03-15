import java.util.Scanner;

public class NineKnights {
    static final int N = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] board = new char[N][N];
        int knightCount = 0;
        for (int i = 0; i < N; i++) {
            char[] line = scan.nextLine().toCharArray();
            for (int j = 0; j < N; j++) {
                board[i][j] = line[j];
                if (board[i][j] == 'k')
                    knightCount++;
            }
        }
        scan.close();
        if (knightCount == 9) 
            System.out.println(checkBoard(board));
        else 
            System.out.println("invalid");

    }

    public static String checkBoard(char[][] board) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '.')
                    continue;

                if (j < N - 2) {
                    if (board[i + 1][j + 2] == 'k') {
                        return "invalid";
                    }
                }
                if (j < N - 1 && i < N - 2) {
                    if (board[i + 2][j + 1] == 'k') {
                        return "invalid";
                    }
                }
                if (j > 1) {
                    if (board[i + 1][j - 2] == 'k') {
                        return "invalid";
                    }
                }
                if (i < N - 2 && j > 0) {
                    if (board[i + 2][j - 1] == 'k') {
                        return "invalid";
                    }
                }   
            }
        }
        return "valid";
    }
}

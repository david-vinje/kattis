import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 500, lowerLim = 1, upperLim = 1000;
        System.out.println(guess);
        String response = in.nextLine();
        while (true) {
            if (response.equals("lower"))
                upperLim = guess-1;
            if (response.equals("higher"))
                lowerLim = guess+1;
            if (response.equals("correct"))
                break;
            guess = (lowerLim + upperLim)/2;
            System.out.println(guess);
            response = in.nextLine();
        }
        in.close();
    }
}

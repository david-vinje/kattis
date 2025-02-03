import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        Set<Character> lettersToGuess = new HashSet<>();
        for (char letter : input) {
            lettersToGuess.add(letter);
        }
        char[] guesses = scan.nextLine().toCharArray();
        int wrong = 0, correct = 0;
        for (char guess : guesses) {
            if (lettersToGuess.contains(guess)) {
                if (++correct == lettersToGuess.size()) {
                    System.out.println("WIN");
                    return;
                }
            } else if (++wrong == 10) {
                System.out.println("LOSE");
                return;
            }
        }
    }
}
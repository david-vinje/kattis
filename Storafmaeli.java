import java.util.Scanner;

public class Storafmaeli {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String result = n % 10 == 0 ? "Jebb" : "Neibb";
    System.out.println(result);
  }
}

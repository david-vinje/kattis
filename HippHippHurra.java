import java.util.Scanner;

public class HippHippHurra {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    int n = scan.nextInt();
    String salute = String.format("Hipp hipp hurra, %s!", name);
    for (int i = 0; i < n; i++) {
      System.out.println(salute);
    }
  }
}

import java.util.Scanner;

public class BlandadBest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    if (n > 1) {
      String a = scan.nextLine();
      String b = scan.nextLine();
      if (!a.equals(b)) {
        System.out.println("blandad best");
      } else {
        System.out.println(a);
      }
    } else {
      System.out.println(scan.nextLine());
    }
  }
}

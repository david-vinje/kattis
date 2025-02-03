import java.util.Scanner;

public class Bladra2 {
  public static void main(String[] args) {
    String[] input = new Scanner(System.in).nextLine().split(" ");
    double v = Double.parseDouble(input[0]);
    double a = Double.parseDouble(input[1]);
    double t = Double.parseDouble(input[2]);
    System.out.println(v*t + a*t*t/2);
  }
}

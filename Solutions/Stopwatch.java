import java.util.Scanner;

public class Stopwatch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    int t1 = scan.nextInt(), t2 = 0;
    boolean timerIsRunning = true;
    while (--n > 0) {
      t2 = scan.nextInt();
      if (timerIsRunning) {
        sum += t2-t1;
      }
      timerIsRunning = !timerIsRunning;
      t1 = t2;
    }
    if (timerIsRunning) {
      System.out.println("still running");
    }
    else {
      System.out.println(sum);
    }
  }
}

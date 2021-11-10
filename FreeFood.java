import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var days = new int[365];
        var k = scan.nextInt();
        for (var i=0; i<k; i++) {
            int d1 = scan.nextInt(), d2 = scan.nextInt();
            for (var j=d1; j<=d2; j++) {
                days[j-1] = 1;
            }
        }
        var sum = 0;
        for (var i=0; i<365; i++) 
            sum += days[i];
        System.out.println(sum);
    }
}

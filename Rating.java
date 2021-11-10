import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt(), k = scan.nextInt();
        double avg = 0;
        for (int i=0; i<k; i++)
            avg += scan.nextInt();
        avg /= n;
        double low = avg - 3*(n-k)/n;
        double high = avg + 3*(n-k)/n;

        System.out.println(low + " " + high);
        // 3/5 - (3*3/5) = -1,2
        // 3/5 + 3*(5-2)/5 = 2,4
        // avg + 3*(n-k)/n
    }
}

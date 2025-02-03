import java.util.Scanner;

public class Stan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String resp = null;
        int min = 1, max = 10;
        boolean stanIsDishon = false;
        while (num != 0) {
            resp = sc.nextLine();
            if (resp.equals("right on")) {
                if (stanIsDishon)
                    System.out.println("Stan is dishonest");
                else
                    System.out.println("Stan may be honest");
                min = 1; max = 10; stanIsDishon = false;
            } else {
                if (resp.equals("too high"))
                    max = num-1;
                else if (resp.equals("too low"))
                    min = num+1;
                if (max < min)
                    stanIsDishon = true;
            }
            num = Integer.parseInt(sc.nextLine());
        }
    }
}

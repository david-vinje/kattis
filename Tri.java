import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if (a+b==c)
            System.out.println(a+"+"+b+"="+c);
        else if (a==b+c)
            System.out.println(a+"="+b+"+"+c);
        else if (a - b == c)
            System.out.println(a + "-" + b + "=" + c);
        else if (a == b - c)
            System.out.println(a + "=" + b + "-" + c);
        else if (a * b == c)
            System.out.println(a + "*" + b + "=" + c);
        else if (a == b * c)
            System.out.println(a + "=" + b + "*" + c);
        else if (a / b == c)
            System.out.println(a + "/" + b + "=" + c);
        else if (a == b / c)
            System.out.println(a + "=" + b + "/" + c);
    }
}

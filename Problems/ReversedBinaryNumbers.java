import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        var k = new Scanner(System.in).nextInt();
        var a = Integer.toBinaryString(k).toCharArray();
        var out = "";
        for (var i=1; i<=a.length; i++)
            out += a[a.length-i];
        System.out.println(Integer.parseInt(out,2));
    }
}

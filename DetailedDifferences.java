import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var k = scan.nextInt(); scan.nextLine();
        for (var n=0; n<k; n++) {
            var s1 = scan.nextLine().toCharArray();
            var s2 = scan.nextLine().toCharArray();
            var s3 = "";
            for (var i=0; i<s1.length; i++) {
                if (s1[i] == s2[i]) {
                    s3 += ".";
                } else {
                    s3 += "*";
                }
            }
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3+"\n");
        }
    }
}

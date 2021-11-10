import java.util.Scanner;

public class Selvsikker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] a = s.split(" "); 

        // replace: ? -> !
        //a[a.length-1] = a[a.length-1].substring(0,a[a.length-1].length())+"!";

        String out = a[1].substring(0, 1).toUpperCase() + a[1].substring(1) + " ";
        out += a[0].substring(0, 1).toLowerCase() + a[0].substring(1) + " ";
        for (int i=2; i<a.length; i++) {
            out += a[i] + " ";
        }
        out = out.replace("?", "!");
        System.out.println(out);
    }
}

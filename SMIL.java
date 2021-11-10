import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        // “:)”, “;)”, “:-)”, or “;-)”.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); sc.close();
        char[] a = s.toCharArray();
        for (int i=0; i<a.length-1; i++) {
            if (a[i] == ':' || a[i] == ';') {
                if (a[i+1] == ')')
                    System.out.println(i);
                if (i<a.length-2)
                    if (a[i+1] == '-' && a[i+2] == ')')
                        System.out.println(i);
            }
        }
        
    }
}

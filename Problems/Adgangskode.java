import java.util.Scanner;

public class Adgangskode {
    public static void main(String[] args) {
        System.out.println(findKodeord());
    }

    static String findKodeord() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        String[] a = new String[n];
        String name = null;
        for (int i = 0; i < n; i++) {
            name = scan.nextLine();
            while (name.equals(""))
                name = scan.nextLine();
            a[i] = name;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
                if ((a[i].length() + a[j].length()) == k)
                    return (a[i] + a[j]).toLowerCase();
        }

        return "*umuligt*";
    }
}

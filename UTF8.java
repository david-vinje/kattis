import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class UTF8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        String[] bytes = new String[k];
        int[] type = new int[4];
        for (int i = 0; i < k; i++) {
            bytes[i] = scan.nextLine();
        }
        int i = 0;
        while (i < k) {
            if (bytes[i].substring(0, 1).equals("0")) {
                type[0]++;
                i++;
            } else if (i+1 < k && bytes[i].substring(0, 3).equals("110")) {
                if (bytes[i + 1].substring(0, 2).equals("10")) {
                    type[1]++;
                    i+=2;
                } else {
                    System.out.println("invalid");
                    return;
                }
            } else if (i+2 < k && bytes[i].substring(0, 4).equals("1110")) {
                if (bytes[i + 1].substring(0, 2).equals("10") && bytes[i + 2].substring(0, 2).equals("10")) {
                    type[2]++;
                    i+=3;
                } else {
                    System.out.println("invalid");
                    return;
                }
            } else if (i+3 < k && bytes[i].substring(0, 5).equals("11110")) {
                if (bytes[i + 1].substring(0, 2).equals("10") && bytes[i + 2].substring(0, 2).equals("10")
                        && bytes[i + 3].substring(0, 2).equals("10")) {
                            type[3]++;
                            i+=4;
                } else {
                    System.out.println("invalid");
                    return;
                }
            } else {
                System.out.println("invalid");
                return;
            }
        }
        for (int j = 0; j < 4; j++)
            System.out.println(type[j]);
    }
}

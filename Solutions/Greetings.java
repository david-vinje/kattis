import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ss = s.substring(1,s.length()-1);
        System.out.println("h"+(ss+ss)+"y");
    }
}
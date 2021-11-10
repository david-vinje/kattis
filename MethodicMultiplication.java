import java.util.Scanner;

public class MethodicMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        int x = scan.nextLine().split("S").length-1;
        int y = scan.nextLine().split("S").length-1;
        System.out.println("S(".repeat(x*y)+"0"+")".repeat(x*y));
    }
}

import java.util.Scanner;

class Echo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for (int i=0; i<3; i++)
            System.out.print(word + " ");
        scan.close();
    }
}

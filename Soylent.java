import java.util.Scanner;
public class Soylent {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double caloriesPerBottle = 400;
        int numberOfDays = scn.nextInt();
        for (int i=0; i<numberOfDays; i++) {
            double caloriesNeeded = scn.nextInt();
            double bottlesNeeded = Math.ceil(caloriesNeeded/caloriesPerBottle);
            System.out.println((int) bottlesNeeded);
        }
    }
}
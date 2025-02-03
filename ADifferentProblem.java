import java.math.BigInteger;
import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String[] nums = scan.nextLine().split(" ");
            long num1 = new BigInteger(nums[0]).longValue();
            long num2 = new BigInteger(nums[1]).longValue();
            System.out.println(Math.abs(num1-num2));
        }
    }
}

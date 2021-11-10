import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        String[] revNums = new String[]{"",""};
        for (int i=0; i<2; i++) {
            char[] ch = nums[i].toCharArray();
            for (int j = 2; j >= 0; j--) {
                revNums[i] += ch[j];
            }
        }
        int num = Math.max(Integer.parseInt(revNums[0]), Integer.parseInt(revNums[1]));
        System.out.println(num);
    }
}

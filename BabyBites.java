import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int bites = Integer.parseInt(input), count = 0;
        input = in.nextLine();
        in.close();
        String[] words = input.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].equals("mumble"))
                count++;
            else if (Integer.parseInt(words[i]) == count+1)
                count++;
        }
        if (count == bites) 
            System.out.println("makes sense");
        else 
        System.out.println("something is fishy");
    }
}
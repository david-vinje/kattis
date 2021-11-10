import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EenyMeeny {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] rhyme = scan.nextLine().split(" ");
        int n = scan.nextInt();
        // String[] team1 = new String[n / 2 + n % 2];
        // String[] team2 = new String[n / 2];
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<String> kids = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String kid = scan.nextLine();
            while (kid.equals(""))
                kid = scan.nextLine();
            kids.add(kid);
        }
        scan.close();

        int count = rhyme.length-1;
        for (int i=0; i<n; i++) {
            if (i%2==0) {
                team1.add(kids.get(count));
                kids.remove(count);
                } else {
                team2.add(kids.get(count));
                kids.remove(count);
            }
            count += rhyme.length - 1;
            if (kids.size()>0)
                count %= kids.size();
        }
        System.out.println(team1.size());
        for (int i=0; i<team1.size(); i++)
            System.out.println(team1.get(i));
            
        System.out.println(team2.size());
        for (int i = 0; i < team2.size(); i++)
            System.out.println(team2.get(i));
    }
}

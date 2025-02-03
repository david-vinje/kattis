import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AClassyProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(reader.readLine());
        for (int j = 0; j < k; j++) {
            List<Person> people = new ArrayList<>();
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                String[] line = reader.readLine().split(" ");
                String name = line[0].substring(0, line[0].length() - 1);
                long rank = computeRank(line[1]);
                people.add(new Person(name, rank));
            }
            Collections.sort(people);
            for (Person person : people) {
                writer.append(person.name + "\n");
            }
            writer.append("==============================\n");
        }
        writer.flush();
    }

    // Got the idea for computing rank from dakoval
    // https://github.com/dakoval/Kattis-Solutions/blob/master/classy.java
    public static long computeRank(String string) {
        StringBuilder sb = new StringBuilder();
        String[] classes = string.split("-");
        for (int i = classes.length-1; i >= 0; i--) {
            if (classes[i].equals("upper")) {
                sb.append(3);
            } else if (classes[i].equals("middle")) {
                sb.append(2);
            } else {
                sb.append(1);
            }
        }
        while (sb.length() < 10) {
            sb.append(2);
        }
        return Long.parseLong(sb.toString());
    }

    public static class Person implements Comparable<Person> {
        String name;
        long rank;

        Person(String name, long rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(AClassyProblem.Person o) {
            if (rank == o.rank) {
                return name.compareTo(o.name)>0 ? 1 : -1;
            }
            return rank < o.rank ? 1 : -1;
        }
    }
}
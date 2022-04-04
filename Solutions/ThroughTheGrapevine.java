import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThroughTheGrapevine {
    private static class Person {
        int skepticism; 
        int dayConvinced; 
        public Person(int skepticism) {
            this.skepticism = skepticism;
            this.dayConvinced = 0;
        }
        public Person(int skepticism, int dayConvinced) {
            this.dayConvinced = dayConvinced;
        }
    }
    public static void main(String[] args) {
        Kattio scan = new Kattio(System.in);
        int n = scan.getInt(), m = scan.getInt(), d = scan.getInt();
        Map<String, Person> people = new HashMap<>(n);
        Map<String, List<String>> graph = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = scan.getWord();
            people.put(name, new Person(scan.getInt()));
            graph.put(name, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String name1 = scan.getWord();
            String name2 = scan.getWord();

            List<String> neighbors = graph.get(name1);
            neighbors.add(name2);
            graph.put(name1, neighbors);

            neighbors = graph.get(name2);
            neighbors.add(name1);
            graph.put(name2, neighbors);
        }
        Map<String, Integer> visited = new HashMap<>(n);
        for (String name : people.keySet()) {
            visited.put(name, 0);
        }
        Deque<String> queue = new ArrayDeque<>();
        String starter = scan.getWord();
        queue.add(starter);
        Set<String> heard = new HashSet<>();
        Set<String> convinced = new HashSet<>();
        convinced.add(starter);
        while (!queue.isEmpty()) {
            String name = queue.pop();
            int dayConvinced = people.get(name).dayConvinced;
            if (d-dayConvinced <= 0) continue;
            List<String> neighbors = graph.get(name);
            for (String neighbor : neighbors) {
                if (convinced.contains(neighbor)) continue;
                heard.add(neighbor);
                int skepticism = people.get(neighbor).skepticism;
                people.put(neighbor, new Person(skepticism-1));
                if (skepticism-1 <= 0) {
                    queue.addLast(neighbor);
                    people.put(neighbor, new Person(0, dayConvinced+1));
                    convinced.add(neighbor);
                }
            }
        }
        System.out.println(heard.size());
    }
}
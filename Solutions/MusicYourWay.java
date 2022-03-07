import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MusicYourWay {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1024);
        PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out, 1024));
        String attributeString = reader.readLine();
        String[] attributeArray = attributeString.split(" ");
        int numAttributes = attributeArray.length;
        Map<String, Integer> attributeMap = new HashMap<>();
        for (int i = 0; i < numAttributes; i++) {
            attributeMap.put(attributeArray[i], i);
        }
        int numSongs = Integer.parseInt(reader.readLine());
        String songs[] = new String[numSongs];
        for (int i = 0; i < numSongs; i++) {
            songs[i] = reader.readLine();
        }
        int numSorts = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numSorts; i++) {
            writer.append(attributeString + "\n");
            int sortKey = attributeMap.get(reader.readLine());
            for (int j = 0; j < numSongs; j++) {
                if (sortKey == 0)
                    break;
                songs[j] = swap(sortKey, songs[j]);
            }
            insertionSort(songs);
            for (int j = 0; j < numSongs; j++) {
                if (sortKey != 0)
                    songs[j] = swap(sortKey, songs[j]);
                writer.append(songs[j] + "\n");
            }
            writer.append("\n");
        }
        writer.flush();
    }

    public static String swap(int sortKey, String song) {
        String[] attributes = song.split(" ");
        String tmp = attributes[0];
        attributes[0] = attributes[sortKey];
        attributes[sortKey] = tmp;
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < attributes.length; k++) {
            sb.append(attributes[k] + " ");
        }
        return sb.toString();
    }

    public static void insertionSort(String[] songs) {
        for (int i = 1; i < songs.length; i++) {
            String wholeKey = songs[i];
            String key = songs[i].split(" ")[0];
            int j = i - 1;
            while (j >= 0 && key.compareTo(songs[j].split(" ")[0]) < 0) {
                songs[j + 1] = songs[j--];
            }
            songs[j + 1] = wholeKey;
        }
    }

}
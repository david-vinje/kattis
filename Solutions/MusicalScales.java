import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MusicalScales {
    public static void main(String[] args) {
        int numScales = 12, scaleLength = 7;
        String[] notes = { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" };
        String[][] scales = new String[numScales][scaleLength];
        for (int i = 0; i < numScales; i++) {
            scales[i][0] = notes[i];
            scales[i][1] = notes[(i + 2) % 12]; // tone
            scales[i][2] = notes[(i + 4) % 12]; // tone
            scales[i][3] = notes[(i + 5) % 12]; // semi
            scales[i][4] = notes[(i + 7) % 12]; // tone
            scales[i][5] = notes[(i + 9) % 12]; // tone
            scales[i][6] = notes[(i + 11) % 12]; // tone
        }
        Map<String[], Boolean> doable = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            doable.put(scales[i], true);
        }
        Kattio scan = new Kattio(System.in);
        int k = scan.getInt();
        List<String> playNotes = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String n = scan.getWord();
            if (!playNotes.contains(n)) {
                playNotes.add(n);
            }
        }
        for (int j = 0; j < numScales; j++) {
            if (doable.get(scales[j])) {
                for (int i = 0; i < playNotes.size(); i++) {
                    boolean canPlay = false;
                    for (int l = 0; l < scaleLength; l++) {
                        if (scales[j][l].equals(playNotes.get(i))) {
                            canPlay = true;
                            break;
                        }
                    }
                    if (!canPlay) {
                        doable.put(scales[j], false);
                        break;
                    }
                }
            }

        }
        List<String> playableScales = new ArrayList<>();
        for (Entry<String[], Boolean> entry : doable.entrySet()) {
            if (entry.getValue()) {
                playableScales.add(entry.getKey()[0]);
            }
        }
        if (playableScales.size() == 0) {
            System.out.println("none");
        } else {
            Collections.sort(playableScales);
            for (String scale : playableScales) {
                System.out.print(scale+" ");
            }
            System.out.println("");
        }
    }
}
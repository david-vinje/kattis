import java.util.Scanner;

public class Skener {
        public static void main(String[] args) {
            var scan = new Scanner(System.in);
            int R = scan.nextInt(), C = scan.nextInt(), ZR = scan.nextInt(), ZC = scan.nextInt();
            scan.nextLine();
            for (var r=0; r<R; r++) {
                var out = "";
                var s = scan.nextLine();
                for (char c : s.toCharArray()) {
                    for (var zc=0; zc<ZC; zc++) {
                        out += c;
                    }
                }
                for (var zr=0; zr<ZR; zr++)
                    System.out.println(out);
            }
        }
    }
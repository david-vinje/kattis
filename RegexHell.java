import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHell {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile(
        "[qwrtpsdfghjklzxcvbnm]?[aeuio][qwrtpsdfghjklzxcvbnm]?",
        Pattern.MULTILINE);
    Matcher matcher = pattern.matcher("coffee");
    StringBuilder sb = new StringBuilder();
    while (matcher.find()) {
      String syllable = matcher.group();
      sb.append(syllable);
      String repetition = syllable.charAt(0) + "";
      if (repetition.matches("[qwrtpsdfghjklzxcvbnm]")) {
        repetition = "p";
      } else {
        repetition = "p" + repetition;
      }
      repetition += syllable.substring(1);
      sb.append(repetition + " ");
    }
    System.out.println(sb.toString());
  }
}
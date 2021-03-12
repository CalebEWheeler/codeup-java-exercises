
public class FirstCapLetter {
  
  public static boolean IsFirstLetterCap(String word) {
      if (word == null || word.length() == 0) return false;
      if (Character.isLetter(word.charAt(0)) && Character.isUpperCase(word.charAt(0))) return true;
      return false;
  }

  public static void main(String[] args) {
    IsFirstLetterCap("0");
    IsFirstLetterCap("lE");
    IsFirstLetterCap("!");
    IsFirstLetterCap(" ");
    IsFirstLetterCap("");
    IsFirstLetterCap(null);
    IsFirstLetterCap("L");
  }
}

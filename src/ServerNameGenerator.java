import java.util.Random;
public class ServerNameGenerator {
    public static String[] adjectives = {"windy", "sticky", "abiding", "adaptable", "deeply", "long", "temporary", "forgetful", "well-groomed", "imminent"};
    public static String[] nouns = {"dog", "cat", "car", "bug", "bear", "key", "pen", "cup", "plate", "chair"};

    public static String randomAdjective() {
        double length = adjectives.length;
        double rand = Math.floor(Math.random() * length);
        int random = (int) rand;
        return adjectives[random];
    }
    public static String randomNoun() {
        double length = nouns.length;
        double rand = Math.floor(Math.random() * length);
        int random = (int) rand;
        return nouns[random];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + randomAdjective() + "-" + randomNoun());
        System.out.println("Here is your server name from Fer:\n" + getWord(adjectives) + "-" + getWord(nouns));
    }

    //Fer's randomizer
    public static String getWord(String[] words) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        return words[randomIndex];
    }
}

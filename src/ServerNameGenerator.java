public class ServerNameGenerator {


    public static String randomAdjective() {
        String[] adjectives = {"windy", "sticky", "abiding", "adaptable", "deeply", "long", "temporary", "forgetful", "well-groomed", "imminent"};
        double length = adjectives.length;
        double rand = Math.floor(Math.random() * length);
        int random = (int) rand;
        return adjectives[random];
    }
    public static String randomNoun() {
        String[] nouns = {"dog", "cat", "car", "bug", "bear", "key", "pen", "cup", "plate", "chair"};
        double length = nouns.length;
        double rand = Math.floor(Math.random() * length);
        int random = (int) rand;
        return nouns[random];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + randomAdjective() + "-" + randomNoun());

    }

    //Fer's walkthrough

}

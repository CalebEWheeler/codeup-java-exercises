public class DishTest {
    public static void main(String [] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 100;
        dish1.nameOfDish = "Poptart";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 75;
        dish2.nameOfDish = "Scrambled Eggs";
        dish2.wouldRecommend = false;

        dish1.printSummary();
        dish2.printSummary();

    }
}

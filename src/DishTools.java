public class DishTools {
//Try out the DishTools methods with Dish objects in the DishTest
// main method (edited)
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;
    public static void shoutDishName(Dish dish1) {
        System.out.println(dish1.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish1) {
        String message = (dish1.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) ?
                "Less expensive than average" :
                "More expensive than average";
        System.out.println(message);
    }

    public static void flipRecommendation(Dish dish1) {
        dish1.wouldRecommend = !dish1.wouldRecommend;
    }

}

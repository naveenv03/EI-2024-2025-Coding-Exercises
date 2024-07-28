// Meal.java
import java.util.ArrayList;
import java.util.List;

class Meal {
    private List<String> components = new ArrayList<>();

    public void addComponent(String component) {
        components.add(component);
    }

    public void showMeal() {
        for (String component : components) {
            System.out.println(component);
        }
    }
}

// MealBuilder.java
abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildMainCourse();
    public abstract void buildSideDish();
    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}

// VegetarianMealBuilder.java
class VegetarianMealBuilder extends MealBuilder {
    public void buildMainCourse() {
        meal.addComponent("Vegetarian Main Course");
    }

    public void buildSideDish() {
        meal.addComponent("Vegetarian Side Dish");
    }

    public void buildDrink() {
        meal.addComponent("Vegetarian Drink");
    }
}

// Main.java
public class Meal_Main {
    public static void main(String[] args) {
        MealBuilder builder = new VegetarianMealBuilder();
        builder.buildMainCourse();
        builder.buildSideDish();
        builder.buildDrink();
        Meal meal = builder.getMeal();
        meal.showMeal();
    }
}

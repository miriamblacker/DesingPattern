package Decorator;

/**
 * CustomCakes demonstrates the use of the Decorator pattern to create custom cakes
 * by adding flavors and toppings to a basic cake.
 */
public class CustomCakes {
    public static void main(String[] args) {
        // Creating a basic cake
        Cake basicCake = new BasicCake();
        System.out.println(basicCake.getDescription() + " - $" + basicCake.getPrice());

        // Adding chocolate flavor
        Cake chocolateCake = new FlavorDecorator(basicCake, "Chocolate", 10.0);
        System.out.println(chocolateCake.getDescription() + " - $" + chocolateCake.getPrice());

        // Adding strawberry topping
        Cake chocolateStrawberryCake = new ToppingDecorator(chocolateCake, "Strawberry", 5.0);
        System.out.println(chocolateStrawberryCake.getDescription() + " - $" + chocolateStrawberryCake.getPrice());

        // Adding nuts topping
        Cake fullyDecoratedCake = new ToppingDecorator(chocolateStrawberryCake, "Nuts", 7.0);
        System.out.println(fullyDecoratedCake.getDescription() + " - $" + fullyDecoratedCake.getPrice());
    }
}

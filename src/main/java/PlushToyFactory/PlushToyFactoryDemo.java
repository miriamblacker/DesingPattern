package PlushToyFactory;

public class PlushToyFactoryDemo {
    public static void main(String[] args) {
        // Create original instances of each plush toy
        PlushToy teddyBear = new TeddyBear("Brown", 1);
        PlushToy bunny = new Bunny("White", 2);
        PlushToy kitten = new Kitten("Gray", 3);

        // Clone the original toys to create variations
        PlushToy clonedTeddyBear = (PlushToy) teddyBear.cloneToy();
        clonedTeddyBear.color = "Pink";

        PlushToy clonedBunny = (PlushToy) bunny.cloneToy();
        clonedBunny.size = 2;

        PlushToy clonedKitten = (PlushToy) kitten.cloneToy();
        clonedKitten.color = "Black";

        // Display descriptions of each toy and their clones
        System.out.println("Original TeddyBear: " + teddyBear);
        System.out.println("Cloned TeddyBear: " + clonedTeddyBear);

        System.out.println("Original Bunny: " + bunny);
        System.out.println("Cloned Bunny: " + clonedBunny);

        System.out.println("Original Kitten: " + kitten);
        System.out.println("Cloned Kitten: " + clonedKitten);
    }
}

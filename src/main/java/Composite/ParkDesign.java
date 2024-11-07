package Composite;

/**
 * ParkDesign class for testing the Composite Design Pattern in the context of a park design.
 */
public class ParkDesign {
    /**
     * Main method for creating and displaying a park structure with various park elements.
     * Demonstrates adding trees and flower beds to a park and displaying the structure.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create individual trees and a flower bed
        ParkElement oakTree = new Tree("Oak");
        ParkElement mapleTree = new Tree("Maple");

        // Create a flower bed and add a mini rose bush to it
        FlowerBed flowerBed1 = new FlowerBed("Rose Garden");
        flowerBed1.addElement(new Tree("Mini Rose Bush"));

        // Create the main park composite and add elements to it
        FlowerBed park = new FlowerBed("Central Park");
        park.addElement(oakTree);
        park.addElement(mapleTree);
        park.addElement(flowerBed1);

        // Display the complete park structure
        park.display();
    }
}

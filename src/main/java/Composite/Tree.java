package Composite;

/**
 * Represents a tree in the park.
 */
public class Tree implements ParkElement {

    private String name;

    /**
     * Constructs a tree with a given name.
     *
     * @param name the name of the tree
     */
    public Tree(String name) {
        this.name = name;
    }

    @Override
    public void addElement(ParkElement element) {
        // Not applicable for Tree, as it does not contain other elements
    }

    @Override
    public void removeElement(ParkElement element) {
        // Remove operation for Tree - simulates removing itself
        System.out.println("Tree: " + name + " has been removed from the park.");
    }

    @Override
    public void display() {
        System.out.println("Tree: " + name);
    }
}

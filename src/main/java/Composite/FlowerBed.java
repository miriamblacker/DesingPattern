package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a flower bed in the park, which can contain other park elements.
 */
public class FlowerBed implements ParkElement {

    private String name;
    private List<ParkElement> elements = new ArrayList<>();

    /**
     * Constructs a flower bed with a given name.
     *
     * @param name the name of the flower bed
     */
    public FlowerBed(String name) {
        this.name = name;
    }

    @Override
    public void addElement(ParkElement element) {
        elements.add(element);
    }

    @Override
    public void removeElement(ParkElement element) {
        elements.remove(element);
    }

    @Override
    public void display() {
        System.out.println("Flower Bed: " + name);
        for (ParkElement element : elements) {
            element.display();
        }
    }
}

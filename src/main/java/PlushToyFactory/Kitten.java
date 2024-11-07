package PlushToyFactory;

public class Kitten extends PlushToy {

    public Kitten(String color, int size) {
        super(color, size);
    }

    @Override
    public Toy cloneToy() {
        return new Kitten(this.color, this.size);
    }
}

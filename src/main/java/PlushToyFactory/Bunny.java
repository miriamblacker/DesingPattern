package PlushToyFactory;

public class Bunny extends PlushToy {

    public Bunny(String color, int size) {
        super(color, size);
    }

    @Override
    public Toy cloneToy() {
        return new Bunny(this.color, this.size);
    }
}
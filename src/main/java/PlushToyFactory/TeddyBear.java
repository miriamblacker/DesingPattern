package PlushToyFactory;

public class TeddyBear extends PlushToy {

    public TeddyBear(String color, int size) {
        super(color, size);
    }

    @Override
    public Toy cloneToy() {
        return new TeddyBear(this.color, this.size);
    }
}

package PlushToyFactory;

public abstract class PlushToy implements Toy {

    protected int size;
    protected String color;

    public PlushToy(String color, int size) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "size=" + size +
                ", color='" + color;
    }

    public abstract Toy cloneToy();

}

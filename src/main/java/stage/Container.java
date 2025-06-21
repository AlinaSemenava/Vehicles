package stage;

public class Container implements Cargo {

    private int weight;

    public Container(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

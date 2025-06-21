package stage;

public class Oil implements Cargo {

    private final int weight;

    public Oil(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}

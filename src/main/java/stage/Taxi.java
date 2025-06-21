package stage;

public class Taxi extends Vehicles {

    private Wheels wheels;

    public Taxi(Wheels wheels) {
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }
}

package stage;

public class Truck extends Vehicles {

    private Wheels wheels;
    private Cargo cargo;

    public Truck(Wheels wheels, Cargo cargo) {
        this.cargo = cargo;
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Cargo getCargo() {
        return cargo;
    }
}

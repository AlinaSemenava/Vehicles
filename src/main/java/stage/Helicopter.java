package stage;

public class Helicopter extends Vehicles {

    private Wheels wheels;
    private Propeller propeller;
    private Cargo cargo;

    public Helicopter(Wheels wheels, Propeller propeller, Cargo cargo) {
        this.cargo = cargo;
        this.propeller = propeller;
        this.wheels = wheels;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Cargo getCargo() {
        return cargo;
    }
}

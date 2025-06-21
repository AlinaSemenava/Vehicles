package stage;

public class Airplane extends Vehicles {

    private Wheels wheels;
    private Propeller propeller;
    private Wings wings;
    private Cargo cargo;

    public Airplane(Wheels wheels, Propeller propeller, Wings wings, Cargo cargo) {
        this.cargo = cargo;
        this.propeller = propeller;
        this.wheels = wheels;
        this.wings = wings;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Wings getWings() {
        return wings;
    }

    public Cargo getCargo() {
        return cargo;
    }
}

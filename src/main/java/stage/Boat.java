package stage;

public class Boat extends Vehicles {

    private Propeller propeller;
    private Cargo cargo;

    public Boat(Propeller propeller, Cargo cargo) {
        this.cargo = cargo;
        this.propeller = propeller;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public Cargo getCargo() {
        return cargo;
    }
}

package stage;

public class Tanker extends Vehicles {

    private Propeller propeller;
    private Cargo cargo;

    public Tanker(Propeller propeller, Cargo cargo) {
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

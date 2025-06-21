package stage;

import org.w3c.dom.ls.LSOutput;

public abstract class Vehicles {
    public static void main(String[] args) {

        Helicopter helicopter = new Helicopter(new Wheels(14), new Propeller(10), new Oil(800));
        assert (helicopter.getWheels().getSize() == 14);
        assert (helicopter.getPropeller().getSize() == 10);
        assert (helicopter.getCargo().getWeight() == 800);

        Airplane airplane = new Airplane(new Wheels(14), new Propeller(10), new Wings(2), new Container(800));
        assert (airplane.getWheels().getSize() == 14);
        assert (airplane.getPropeller().getSize() == 10);
        assert (airplane.getCargo().getWeight() == 800);
        assert (airplane.getWings().getSize() == 2);
    }

}

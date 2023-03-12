package Units;

public class Peasant extends Unit {

    public Peasant(String name) {
        super(250, 255, 20, name);
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

    // @Override
    // public void step() {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'step'");
    // }

}
package Units;

public class XBowMan extends Shooter {
    public XBowMan(String name) {
        super(50, 6, 8, 56, name);
    }

    // @Override
    // public void step(ArrayList<Unit> team) {
    // System.out.println("Арбалетчик высрелил!");
    // }

    public String getInfo() {
        return "XBowMan";
    }

}
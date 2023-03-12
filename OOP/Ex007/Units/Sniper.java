package Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name) {
        super(79, 9, 6, 9, name);
    }

    // @Override
    // public void step(ArrayList<Unit> team) {
    // System.out.println("Снайпер высрелил!");
    // }

    public String getInfo() {
        return "Sniper";
    }

}
package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit {
    protected int arrows;

    public Shooter(float hp, int speed, int damage, int arrows, String name) {
        super(hp, speed, damage, name);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for (Unit unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage);
                    this.arrows--;
                    break;
                }
            }
        }
        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

        for (Unit unit : friends) {
            if (unit.getInfo().equals("Peasant")) {
                this.arrows++;
                break;
            }
        }
        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

    }

    // @Override
    // public String toString() {
    // return "Осталось стрел:" + String.valueOf(arrows);
    // }

}

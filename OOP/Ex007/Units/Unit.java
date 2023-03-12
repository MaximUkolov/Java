package Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements UnitInterface {

    protected Random rnd = new Random();

    protected float hp;
    protected int speed;
    protected int damage;
    protected final String NAME;

    public void getNAME() {
        System.out.println(NAME);
    }

    public Unit(float hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> team2) {
        // System.out.println("Шаг.");
    }

    public int getSpeed() {
        return this.speed;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public void attack(Unit target, int damage) {
        int causedDamage = rnd.nextInt(1, damage);
        System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Power of knock = %d\n", causedDamage);
        System.out.printf("%s hp= %.2f\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }

    @Override
    public String getInfo() {
        return "";
    }

}
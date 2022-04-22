package java_pokemon;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String name;
    public int health;
    protected int energy;
    protected int level;
    public ArrayList<Attack> attacks;

    public Pokemon(String name, int health, int energy, int level) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.level = level;
        this.attacks = new ArrayList<>();;
    }

    String getName() {
        return this.name;
    }

    int getHealth() {
        return this.health;
    }

    int getEnergy() {
        return this.energy;
    }

    abstract String getType();

    public boolean attack(int number, Pokemon enemy) {
        Attack attack = attacks.get(number);
        int energycost = attack.getEnergycost();

        if(energy < energycost) {
            return false;
        } else {
            enemy.health -= attack.getDmg();
            energy -= attack.getEnergycost();
            return true;
        }

    }

}
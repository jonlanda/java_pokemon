package java_pokemon;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String name;
    public int health;
    protected int maxHealth;
    protected int energy;
    protected int level;
    public ArrayList<Attack> attacks;

    public Pokemon(String name, int health, int energy, int level) {
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.energy = energy;
        this.level = level;
        this.attacks = new ArrayList<Attack>();
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
        if (attack.getEffective() == enemy.getType()) {
            if (energy < energycost) {
                return false;
            } else {
                System.out.println("It's super effective!\n");
                enemy.health -= attack.getDmg() * 1.25;
                energy -= energycost;
                energy++;
                return true;
            }
        } else {
            if (energy < energycost) {
                return false;
            } else {
                enemy.health -= attack.getDmg();
                energy -= energycost;
                energy++;
                return true;
            }
        }

    }

    public boolean atkEne(int number, Pokemon enemy) {
        Attack attack = attacks.get(number);
        if (attack.getEffective() == enemy.getType()) {
            System.out.println("It's super effective!\n");
            enemy.health -= attack.getDmg() * 1.25;
            return true;
        } else {
            enemy.health -= attack.getDmg();
            return true;
        }
    }

    public void heal() {
        this.health = this.maxHealth;
    }

    public void showAttacks() {
        System.out.println(" Here the list of its attacks: \n");
        int i = 0;
        for (Attack attack : this.attacks) {
            i++;
            System.out.print(i + ")  " + attack.getAttackName());
            System.out.print("  deals " + attack.getDmg() + " damage,");
            System.out.print("  costs " + attack.getEnergycost() + " energy and");
            System.out.println(" is effective against " + attack.getEffective());
        }
    }
}

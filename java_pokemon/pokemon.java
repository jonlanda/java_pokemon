package java_pokemon;


public class pokemon {
    private String name;
    private int health;
    private int energy;

    public pokemon(String name, int health, int energy) {
        this.name = name;
        this.health = health;
        this.energy = energy;
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

}

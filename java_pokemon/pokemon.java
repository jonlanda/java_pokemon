package java_pokemon;


public class pokemon {
    private String name;
    private int health;
    private int energy;
    private String type;

    public pokemon(String name, int health, int energy, String type) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.type = type;
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

    String getType() {
        return this.type;
    }

}

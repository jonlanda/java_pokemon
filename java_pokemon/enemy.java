package java_pokemon;

public class enemy {
    private String name;
    private int health;
    private String type;

    public enemy(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    String getName() {
        return this.name;
    }

    int getHealth() {
        return this.health;
    }

    String getType() {
        return this.type;
    }
}

package java_pokemon;

public class Togedemaru extends Pokemon {

    public Togedemaru(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Nuzzle", 5, 0, "Water"));
        this.attacks.add(new Attack("Thunder Shock", 5, 0, "Water"));
        this.attacks.add(new Attack("Wild Charge", 5, 0, "Water"));
    }

    String getType() {
        return "Electric";
    }
}
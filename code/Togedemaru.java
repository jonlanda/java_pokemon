package code;

public class Togedemaru extends Pokemon {

    public Togedemaru(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Nuzzle", 11, 0, "Water"));
        this.attacks.add(new Attack("Thunder Shock", 22, 3, "Flying"));
        this.attacks.add(new Attack("Wild Charge", 32, 5, "Water"));
    }

    String getType() {
        return "Electric";
    }
}
package java_pokemon;

public class Dedenne extends Pokemon {

    public Dedenne(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Charge", 5, 0, "Water"));
        this.attacks.add(new Attack("Volt Switch", 11, 0, "Water"));
        this.attacks.add(new Attack("Thunder", 19, 4, "Water"));
    }

    String getType() {
        return "Electric";
    }
}

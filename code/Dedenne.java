package code;

public class Dedenne extends Pokemon {

    public Dedenne(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Charge", 9, 0, "Water"));
        this.attacks.add(new Attack("Volt Switch", 19, 2, "Flying"));
        this.attacks.add(new Attack("Thunder", 29, 4, "Water"));
    }

    String getType() {
        return "Electric";
    }
}

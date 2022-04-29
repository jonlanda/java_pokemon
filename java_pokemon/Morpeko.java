package java_pokemon;

public class Morpeko extends Pokemon {

    public Morpeko(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Famished", 6, 0, "Water"));
        this.attacks.add(new Attack("Spark", 9, 2, "Water"));
        this.attacks.add(new Attack("Aura Wheel", 14, 4, "Water"));
    }

    String getType() {
        return "Electric";
    }
}

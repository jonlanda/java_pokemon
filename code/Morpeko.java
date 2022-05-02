package code;

public class Morpeko extends Pokemon {

    public Morpeko(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Famished", 9, 0, "Water"));
        this.attacks.add(new Attack("Spark", 20, 2, "Flying"));
        this.attacks.add(new Attack("Aura Wheel", 33, 5, "Water"));
    }

    String getType() {
        return "Electric";
    }
}

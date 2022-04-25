package java_pokemon;

public class Greedent extends Pokemon {

    public Greedent(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Swallow", 5, 0, "Ground"));
        this.attacks.add(new Attack("Spit Up", 11, 2, "Ground"));
        this.attacks.add(new Attack("Super Fang", 13, 4, "Ground"));
    }

    String getType() {
        return "Normal";
    }
}


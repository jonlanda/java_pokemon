package java_pokemon;

public class Greedent extends Pokemon {

    public Greedent(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Swallow", 11, 0, "Ground"));
        this.attacks.add(new Attack("Spit Up", 22, 2, "Electric"));
        this.attacks.add(new Attack("Super Fang", 33, 4, "Dark"));
    }

    String getType() {
        return "Normal";
    }
}

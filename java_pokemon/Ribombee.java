package java_pokemon;

public class Ribombee extends Pokemon {

    public Ribombee(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Pollen Puff", 8, 0, "Dark"));
        this.attacks.add(new Attack("Bug Buzz", 18, 1, "Grass"));
        this.attacks.add(new Attack("Quiver Dance", 27, 4, "Dark"));
    }

    String getType() {
        return "Bug";
    }
}
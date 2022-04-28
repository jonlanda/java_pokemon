package java_pokemon;

public class Charizard extends Pokemon {
    public Charizard(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dragon Blast", 20, 0, "Steel"));
        this.attacks.add(new Attack("Fire Blast", 11, 0, "Grass"));
        this.attacks.add(new Attack("Inferno", 19, 4, "Grass"));
    }

    String getType() {
        return "Fire";
    }
}

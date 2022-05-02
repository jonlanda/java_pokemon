package code;

public class Charizard extends Pokemon {
    public Charizard(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dragon Blast", 18, 0, "Steel"));
        this.attacks.add(new Attack("Fire Blast", 20, 0, "Grass"));
        this.attacks.add(new Attack("Inferno", 29, 4, "Grass"));
    }

    String getType() {
        return "Fire";
    }
}

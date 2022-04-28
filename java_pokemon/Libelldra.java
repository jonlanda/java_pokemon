package java_pokemon;

public class Libelldra extends Pokemon {
    public Libelldra(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dragon Rush", 5, 0, "Steel"));
        this.attacks.add(new Attack("Dragon Pulse", 9, 2, "Steel"));
        this.attacks.add(new Attack("Dragon Tail", 14, 4, "Steel"));
    }

    String getType() {
        return "Dragon";
    }
}
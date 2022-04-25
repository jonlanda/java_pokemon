package java_pokemon;

public class Librava extends Pokemon {
    public Librava(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dragon Breath", 5, 0, "Steel"));
        this.attacks.add(new Attack("Sand Attack", 9, 2, "Steel"));
        this.attacks.add(new Attack("Fury Cutter", 14, 4, "Steel"));
    }

    String getType() {
        return "Dragon";
    }
}

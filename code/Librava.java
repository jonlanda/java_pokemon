package code;

public class Librava extends Pokemon {
    public Librava(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dragon Breath", 8, 0, "Steel"));
        this.attacks.add(new Attack("Sand Attack", 18, 2, "Dragon"));
        this.attacks.add(new Attack("Fury Cutter", 28, 4, "Steel"));
    }

    String getType() {
        return "Dragon";
    }
}

package code;

public class Aegislash extends Pokemon {
    public Aegislash(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Fury Cutter", 10, 0, "Dark"));
        this.attacks.add(new Attack("Shadow Claw", 24, 2, "Psychic"));
        this.attacks.add(new Attack("Iron Head", 30, 4, "Bug"));
    }

    String getType() {
        return "Steel";
    }
}

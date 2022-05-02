package code;

public class Lucario extends Pokemon {
    public Lucario(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Focus Blast", 12, 0, "Normal"));
        this.attacks.add(new Attack("Close Combat", 25, 3, "Dark"));
        this.attacks.add(new Attack("Aura Sphere", 33, 4, "Normal"));
    }

    String getType() {
        return "Fighting";
    }

}

package java_pokemon;

public class Lucario extends Pokemon {
    public Lucario(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Focus Blast", 5, 0, "Normal"));
        this.attacks.add(new Attack("Close Combat", 9, 2, "Normal"));
        this.attacks.add(new Attack("Aura Sphere", 14, 4, "Normal"));
    }

    String getType() {
        return "Fighting";
    }

}

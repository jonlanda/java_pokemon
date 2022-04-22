package java_pokemon;

public class Centiskorch extends Pokemon {

    public Centiskorch(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Fire Lash", 5, 0, "Grass"));
        this.attacks.add(new Attack("Fire Wheel", 8, 0, "Grass"));
        this.attacks.add(new Attack("Burn Up", 13, 0, "Grass"));
    }

    String getType() {
        return "Fire";
    }
}

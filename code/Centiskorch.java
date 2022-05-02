package code;

public class Centiskorch extends Pokemon {

    public Centiskorch(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Fire Lash", 11, 0, "Grass"));
        this.attacks.add(new Attack("Fire Wheel", 23, 3, "Ice"));
        this.attacks.add(new Attack("Burn Up", 40, 5, "Grass"));
    }

    String getType() {
        return "Fire";
    }
}

package code;

public class Grimer extends Pokemon {
    public Grimer(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Poison Gas", 0, 0, "Fairy"));
        this.attacks.add(new Attack("Sludge", 14, 1, "Fairy"));
        this.attacks.add(new Attack("Bounce", 28, 3, "Fairy"));
    }

    String getType() {
        return "Poison";
    }
}

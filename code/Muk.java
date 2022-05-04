package code;

public class Muk extends Pokemon {
    public Muk(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Smog", 13, 0, "Fairy"));
        this.attacks.add(new Attack("Sludge Bomb", 24, 2, "Grass"));
        this.attacks.add(new Attack("Gunk Shot", 35, 3, "Fairy"));
    }

    String getType() {
        return "Poison";
    }
}

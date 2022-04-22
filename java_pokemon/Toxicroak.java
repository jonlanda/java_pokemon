package java_pokemon;

public class Toxicroak extends Pokemon {
    public Toxicroak(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Sludge Bomb", 5, 0, "Fairy"));
        this.attacks.add(new Attack("Belch", 9, 2, "Fairy"));
        this.attacks.add(new Attack("Toxic", 14, 4, "Fairy"));
    }

    String getType() {
        return "Poison";
    }

}

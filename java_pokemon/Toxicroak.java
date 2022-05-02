package java_pokemon;

public class Toxicroak extends Pokemon {
    public Toxicroak(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Sludge Bomb", 12, 0, "Fairy"));
        this.attacks.add(new Attack("Belch", 23, 2, "Psychic"));
        this.attacks.add(new Attack("Toxic", 39, 5, "Fairy"));
    }

    String getType() {
        return "Poison";
    }

}

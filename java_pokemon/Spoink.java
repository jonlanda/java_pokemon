package java_pokemon;

public class Spoink extends Pokemon {
    public Spoink(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Confusion", 5, 0, "Psychic"));
        this.attacks.add(new Attack("Psybeam", 9, 2, "Psychic"));
        this.attacks.add(new Attack("Facade", 14, 4, "Psychic"));
    }

    String getType() {
        return "Psychic";
    }

}

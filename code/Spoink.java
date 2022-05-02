package code;

public class Spoink extends Pokemon {
    public Spoink(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Confusion", 5, 0, "Psychic"));
        this.attacks.add(new Attack("Psybeam", 16, 2, "Poison"));
        this.attacks.add(new Attack("Facade", 22, 4, "Psychic"));
    }

    String getType() {
        return "Psychic";
    }

}

package code;

public class Grumpig extends Pokemon {
    public Grumpig(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Psychic", 7, 0, "Poison"));
        this.attacks.add(new Attack("Zen Headbutt", 19, 1, "Psychic"));
        this.attacks.add(new Attack("Bounce", 37, 4, "Poison"));
    }

    String getType() {
        return "Psychic";
    }

}

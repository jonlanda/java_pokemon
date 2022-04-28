package java_pokemon;

public class Grumpig extends Pokemon {
    public Grumpig(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Psychic", 5, 0, "Poison"));
        this.attacks.add(new Attack("Zen Headbutt", 9, 2, "Poison"));
        this.attacks.add(new Attack("Bounce", 14, 4, "Poison"));
    }

    String getType() {
        return "Psychic";
    }

}

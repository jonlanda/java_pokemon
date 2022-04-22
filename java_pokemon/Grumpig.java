package java_pokemon;

public class Grumpig extends Pokemon {
    public Grumpig(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Psychic", 5, 0, "Psychic"));
        this.attacks.add(new Attack("Zen Headbutt", 9, 2, "Psychic"));
        this.attacks.add(new Attack("Bounce", 14, 4, "Psychic"));
    }

    String getType() {
        return "Psychic";
    }

}

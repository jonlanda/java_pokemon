package java_pokemon;

public class Trevenant extends Pokemon {
    public Trevenant(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Shadow Ball", 5, 0, "Psychic"));
        this.attacks.add(new Attack("Shadow Claw", 9, 2, "Psychic"));
        this.attacks.add(new Attack("Phantom Force", 14, 4, "Psychic"));
    }

    String getType() {
        return "Ghost";
    }
}

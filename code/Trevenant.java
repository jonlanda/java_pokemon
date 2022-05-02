package code;

public class Trevenant extends Pokemon {
    public Trevenant(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Shadow Ball", 13, 0, "Psychic"));
        this.attacks.add(new Attack("Shadow Claw", 25, 2, "Ghost"));
        this.attacks.add(new Attack("Phantom Force", 33, 4, "Psychic"));
    }

    String getType() {
        return "Ghost";
    }
}

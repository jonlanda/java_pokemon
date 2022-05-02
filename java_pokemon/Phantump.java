package java_pokemon;

public class Phantump extends Pokemon {
    public Phantump(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Astonish", 6, 0, "Psychic"));
        this.attacks.add(new Attack("Confuse Ray", 18, 2, "Ghost"));
        this.attacks.add(new Attack("Curse", 24, 4, "Psychic"));
    }

    String getType() {
        return "Ghost";
    }
}

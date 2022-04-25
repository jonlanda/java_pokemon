package java_pokemon;

public class Phantump extends Pokemon {
    public Phantump(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Astonish", 5, 0, "Psychic"));
        this.attacks.add(new Attack("Confuse Ray", 9, 2, "Psychic"));
        this.attacks.add(new Attack("Curse", 14, 4, "Psychic"));
    }

    String getType() {
        return "Ghost";
    }
}

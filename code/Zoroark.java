package code;

public class Zoroark extends Pokemon {

    public Zoroark(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Night Daze", 14, 0, "Ghost"));
        this.attacks.add(new Attack("Foul Play", 29, 2, "Psychic"));
        this.attacks.add(new Attack("Night Slash", 38, 4, "Ghost"));
    }

    String getType() {
        return "Dark";
    }
}

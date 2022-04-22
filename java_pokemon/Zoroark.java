package java_pokemon;

public class Zoroark extends Pokemon {

    public Zoroark(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Night Daze", 30, 0, "Ghost"));
        this.attacks.add(new Attack("Foul Play", 40, 2, "Ghost"));
        this.attacks.add(new Attack("Night Slash", 50, 4, "Ghost"));
    }

    String getType() {
        return "Dark";
    }
}

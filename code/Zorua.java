package code;

public class Zorua extends Pokemon {

    public Zorua(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Scratch", 5, 0, "Ghost"));
        this.attacks.add(new Attack("Knock Off", 13, 2, "Psychic"));
        this.attacks.add(new Attack("Payback", 20, 4, "Ghost"));
    }

    String getType() {
        return "Dark";
    }
}

package java_pokemon;

public class Snom extends Pokemon {

    public Snom(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Powder Snow", 5, 0, "Ground"));
        this.attacks.add(new Attack("Struggle Bug", 11, 1, "Dragon"));
        this.attacks.add(new Attack("Icicle Spear", 18, 4, "Ground"));
    }

    String getType() {
        return "Ice";
    }
}
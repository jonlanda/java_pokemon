package java_pokemon;

public class Snom extends Pokemon {

    public Snom(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Powder Snow", 5, 0, "Ground"));
        this.attacks.add(new Attack("Struggle Bug", 8, 0, "Ground"));
        this.attacks.add(new Attack("Icicle Spear", 13, 0, "Ground"));
    }

    String getType() {
        return "Ice";
    }
}
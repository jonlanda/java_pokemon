package java_pokemon;

public class Cutiefly extends Pokemon {

    public Cutiefly(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Struggle Bug", 5, 0, "Unlicht"));
        this.attacks.add(new Attack("Draining Kiss", 8, 0, "Unlicht"));
        this.attacks.add(new Attack("Dazzling Gleam", 13, 0, "Unlicht"));
    }

    String getType() {
        return "Bug";
    }
}
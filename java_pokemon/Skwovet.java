package java_pokemon;

public class Skwovet extends Pokemon {

    public Skwovet(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Tackle", 5, 0, "Ground"));
        this.attacks.add(new Attack("Tail Whip", 11, 2, "Ground"));
        this.attacks.add(new Attack("Body Slam", 13, 4, "Ground"));
    }

    String getType() {
        return "Normal";
    }
}

package java_pokemon;

public class Bronzong extends Pokemon {
    public Bronzong(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Metal Sound", 5, 0, "Bug"));
        this.attacks.add(new Attack("Flash Cannon", 9, 2, "Bug"));
        this.attacks.add(new Attack("Heavy Slam", 14, 4, "Bug"));
    }

    String getType() {
        return "Steel";
    }
}

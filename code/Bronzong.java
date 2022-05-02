package code;

public class Bronzong extends Pokemon {
    public Bronzong(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Metal Sound", 8, 0, "Bug"));
        this.attacks.add(new Attack("Flash Cannon", 14, 2, "Fairy"));
        this.attacks.add(new Attack("Heavy Slam", 25, 4, "Bug"));
    }

    String getType() {
        return "Steel";
    }
}

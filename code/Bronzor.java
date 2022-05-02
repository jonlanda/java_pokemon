package code;

public class Bronzor extends Pokemon {
    public Bronzor(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Gyro Ball", 5, 0, "Bug"));
        this.attacks.add(new Attack("Iron Defense", 10, 2, "Fairy"));
        this.attacks.add(new Attack("Confusion", 15, 4, "Bug"));
    }

    String getType() {
        return "Steel";
    }
}

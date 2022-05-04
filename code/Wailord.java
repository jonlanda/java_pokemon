package code;

public class Wailord extends Pokemon {

    public Wailord(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Hydro Pump", 7, 0, "Fire"));
        this.attacks.add(new Attack("Body Slam", 13, 1, "Ground"));
        this.attacks.add(new Attack("Water Spout", 24, 4, "Fire"));
    }

    String getType() {
        return "Water";
    }
}


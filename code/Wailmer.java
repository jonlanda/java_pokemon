package code;

public class Wailmer extends Pokemon {

    public Wailmer(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Water Gun", 5, 0, "Fire"));
        this.attacks.add(new Attack("Growl", 11, 2, "Ground"));
        this.attacks.add(new Attack("Water Pulse", 19, 4, "Fire"));
    }

    String getType() {
        return "Water";
    }
}

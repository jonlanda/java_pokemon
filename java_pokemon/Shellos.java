package java_pokemon;

public class Shellos extends Pokemon {

    public Shellos(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Tackle", 5, 0, "Fire"));
        this.attacks.add(new Attack("Water Pulse", 8, 0, "Fire"));
        this.attacks.add(new Attack("Hydro Pump", 13, 0, "Fire"));
    }

    String getType() {
        return "Water";
    }
}

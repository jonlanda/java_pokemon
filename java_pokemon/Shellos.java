package java_pokemon;

public class Shellos extends Pokemon {

    public Shellos(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Tackle", 5, 0, "Fire"));
        this.attacks.add(new Attack("Water Pulse", 13, 2, "Ground"));
        this.attacks.add(new Attack("Hydro Pump", 20, 4, "Fire"));
    }

    String getType() {
        return "Water";
    }
}

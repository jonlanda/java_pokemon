package java_pokemon;

public class Gastrodon extends Pokemon {

    public Gastrodon(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Water Pulse", 9, 0, "Fire"));
        this.attacks.add(new Attack("Surfer", 12, 0, "Fire"));
        this.attacks.add(new Attack("Hydro Pump", 14, 0, "Fire"));
    }

    String getType() {
        return "Water";
    }
}
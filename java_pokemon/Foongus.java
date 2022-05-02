package java_pokemon;

public class Foongus extends Pokemon {

    public Foongus(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Absorb", 5, 0, "Rock"));
        this.attacks.add(new Attack("Stun Spore", 11, 1, "Rock"));
        this.attacks.add(new Attack("Mega Drain", 19, 2, "Rock"));
    }

    String getType() {
        return "Grass";
    }
}
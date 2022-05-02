package java_pokemon;

public class Amoongus extends Pokemon {

    public Amoongus(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Ingrain", 5, 0, "Rock"));
        this.attacks.add(new Attack("Spore", 15, 2, "Ground"));
        this.attacks.add(new Attack("Solar Beam", 30, 4, "Rock"));
    }

    String getType() {
        return "Grass";
    }
}

package java_pokemon;

public class Kabutops extends Pokemon {
    public Kabutops(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Leech Life", 11, 0, "Ice"));
        this.attacks.add(new Attack("Stone Edge", 24, 3, "Fire"));
        this.attacks.add(new Attack("Dig", 30, 4, "Ice"));
    }

    String getType() {
        return "Rock";
    }

}

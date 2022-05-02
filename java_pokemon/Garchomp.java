package java_pokemon;

public class Garchomp extends Pokemon {
    public Garchomp(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Outrage", 15, 0, "Steel"));
        this.attacks.add(new Attack("Earthquake", 23, 2, "Electric"));
        this.attacks.add(new Attack("Draco Meteor", 33, 4, "Dragon"));
    }

    String getType() {
        return "Dragon";
    }
}

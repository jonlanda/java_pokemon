package java_pokemon;

public class Sizzlipede extends Pokemon {

    public Sizzlipede(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Ember", 5, 0, "Grass"));
        this.attacks.add(new Attack("Smokescreen", 8, 0, "Grass"));
        this.attacks.add(new Attack("Fire Spin", 13, 0, "Grass"));
    }

    String getType() {
        return "Fire";
    }
}

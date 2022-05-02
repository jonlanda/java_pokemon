package java_pokemon;

public class Frosmoth extends Pokemon {

    public Frosmoth(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Ice Wind", 5, 0, "Ground"));
        this.attacks.add(new Attack("Aurora Beam", 19, 2, "Dragon"));
        this.attacks.add(new Attack("Blizzard", 30, 4, "Ground"));
    }

    String getType() {
        return "Ice";
    }
}

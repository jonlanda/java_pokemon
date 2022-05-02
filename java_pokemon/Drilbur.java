package java_pokemon;

public class Drilbur extends Pokemon {
    public Drilbur(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Mud-Slap", 7, 0, "Electric"));
        this.attacks.add(new Attack("Sand-Tomb", 18, 2, "Rock"));
        this.attacks.add(new Attack("Bulldoze", 25, 3, "Electric"));
    }

    String getType() {
        return "Ground";
    }
}

package java_pokemon;

public class Drilbur extends Pokemon {
    public Drilbur(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Mud-Slap", 5, 0, "Electric"));
        this.attacks.add(new Attack("Sand-Tomb", 9, 2, "Electric"));
        this.attacks.add(new Attack("Bulldoze", 14, 4, "Electric"));
    }

    String getType() {
        return "Ground";
    }
}

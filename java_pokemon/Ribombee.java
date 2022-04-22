package java_pokemon;

public class Ribombee extends Pokemon {

    public Ribombee(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Pollen Puff", 5, 0, "Unlicht"));
        this.attacks.add(new Attack("Bug Buzz", 8, 0, "Unlicht"));
        this.attacks.add(new Attack("Quiver Dance", 13, 0, "Unlicht"));
    }

    String getType() {
        return "Bug";
    }
}
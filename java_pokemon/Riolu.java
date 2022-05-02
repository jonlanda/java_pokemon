package java_pokemon;

public class Riolu extends Pokemon {

    public Riolu(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Rock Smash", 5, 0, "Normal"));
        this.attacks.add(new Attack("Force Palm", 13, 2, "Ice"));
        this.attacks.add(new Attack("Vacuum ", 20, 4, "Normal"));
    }

    String getType() {
        return "Fighting";
    }

}

package java_pokemon;

public class Kabuto extends Pokemon {
    public Kabuto(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Scratch", 5, 0, "Ice"));
        this.attacks.add(new Attack("Ancient Power", 10, 2, "Fire"));
        this.attacks.add(new Attack("Vacuum ", 20, 4, "Ice"));
    }

    String getType() {
        return "Rock";
    }

}

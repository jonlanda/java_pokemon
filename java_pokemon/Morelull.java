package java_pokemon;

public class Morelull extends Pokemon {
    public Morelull(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Moonlight", 5, 0, "Dragon"));
        this.attacks.add(new Attack("Dazzling Gleam", 8, 0, "Dragon"));
        this.attacks.add(new Attack("Draining Kiss", 13, 0, "Dragon"));
    }

    String getType() {
        return "Fairy";
    }
}

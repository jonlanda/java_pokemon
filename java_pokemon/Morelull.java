package java_pokemon;

public class Morelull extends Pokemon {
    public Morelull(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Moonlight", 5, 0, "Dragon"));
        this.attacks.add(new Attack("Dazzling Gleam", 14, 2, "Fighting"));
        this.attacks.add(new Attack("Draining Kiss", 20, 4, "Dragon"));
    }

    String getType() {
        return "Fairy";
    }
}

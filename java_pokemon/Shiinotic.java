package java_pokemon;

public class Shiinotic extends Pokemon {
    public Shiinotic(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Sludge Bomb", 5, 0, "Dragon"));
        this.attacks.add(new Attack("Energy Ball", 8, 0, "Dragon"));
        this.attacks.add(new Attack("Moonblast", 13, 0, "Dragon"));
    }

    String getType() {
        return "Fairy";
    }
}

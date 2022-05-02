package java_pokemon;

public class Shiinotic extends Pokemon {
    public Shiinotic(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Sludge Bomb", 10, 0, "Dragon"));
        this.attacks.add(new Attack("Energy Ball", 20, 2, "Fighting"));
        this.attacks.add(new Attack("Moonblast", 28, 3, "Dragon"));
    }

    String getType() {
        return "Fairy";
    }
}

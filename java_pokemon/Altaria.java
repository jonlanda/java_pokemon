package java_pokemon;

public class Altaria extends Pokemon {
    public Altaria(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Hurricane", 10, 0, "Fighting"));
        this.attacks.add(new Attack("Fly", 20, 2, "Fighting"));
        this.attacks.add(new Attack("Sky Attack", 35, 4, "Fighting"));
    }

    String getType() {
        return "Flying";
    }
}

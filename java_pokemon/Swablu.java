package java_pokemon;

public class Swablu extends Pokemon {

    public Swablu(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Peck", 5, 0, "Fighting"));
        this.attacks.add(new Attack("Aerial Ace", 13, 2, "Bug"));
        this.attacks.add(new Attack("Pluck", 20, 4, "Fighting"));
    }

    String getType() {
        return "Flying";
    }
}

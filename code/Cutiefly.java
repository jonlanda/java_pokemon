package code;

public class Cutiefly extends Pokemon {

    public Cutiefly(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Struggle Bug", 5, 0, "Dark"));
        this.attacks.add(new Attack("Draining Kiss", 10, 1, "Psychic"));
        this.attacks.add(new Attack("Dazzling Gleam", 20, 3, "Dark"));
    }

    String getType() {
        return "Bug";
    }
}
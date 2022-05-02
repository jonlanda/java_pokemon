package java_pokemon;

public class Croagunk extends Pokemon {
    public Croagunk(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Poison Sting", 5, 0, "Fairy"));
        this.attacks.add(new Attack("Venoshock", 18, 2, "Grass"));
        this.attacks.add(new Attack("Poison Jab", 27, 4, "Fairy"));
    }

    String getType() {
        return "Poison";
    }

}

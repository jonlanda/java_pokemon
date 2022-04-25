package java_pokemon;

public class Absol extends Pokemon {

    public  Absol(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Quick Attack", 5, 0, "Ghost"));
        this.attacks.add(new Attack("Night Slash", 5, 0, "Ghost"));
        this.attacks.add(new Attack("Dark Pulse", 5, 0, "Ghost"));
    }

    String getType() {
        return "Dark";
    }
}

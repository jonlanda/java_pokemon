package java_pokemon;

public class Karpador extends Pokemon {
    public Karpador(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Splash", 0, 0, "Fire"));
    }



    String getType() {
        return "Water";
    }
}

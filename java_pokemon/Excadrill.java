package java_pokemon;

public class Excadrill extends Pokemon {
    public Excadrill(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dig", 5, 0, "Electric"));
        this.attacks.add(new Attack("Earthquake", 9, 2, "Electric"));
        this.attacks.add(new Attack("Stomping Tantrum", 14, 4, "Electric"));
    }

    String getType() {
        return "Ground";
    }
}

package java_pokemon;

public class Excadrill extends Pokemon {
    public Excadrill(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Dig", 13, 0, "Electric"));
        this.attacks.add(new Attack("Earthquake", 26, 2, "Rock"));
        this.attacks.add(new Attack("Stomping Tantrum", 36, 4, "Electric"));
    }

    String getType() {
        return "Ground";
    }
}

package java_pokemon;

import java.util.ArrayList;

public class Champ {
    public ArrayList<Pokemon> Champteam;

    public Champ() {
        String name = "Daddy Shake";
        this.Champteam = new ArrayList<Pokemon>();
        this.Champteam.add(new Charizard("Charizard", 100, 19000, 25));
        this.Champteam.add(new Alakazam("Alakazam", 100, 19000, 25));
        this.Champteam.add(new Garchomp("Garchomp", 100, 19000, 25));
        this.Champteam.add(new Aegislash("Aegislash", 100, 19000, 25));

    }
}

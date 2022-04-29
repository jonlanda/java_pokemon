package java_pokemon;

import java.util.ArrayList;

public class Trainer {

    public static ArrayList<Pokemon> team;

    public Trainer() {
        Trainer.team = new ArrayList<Pokemon>();
        Trainer.team.add(getStarter());
    }

    public Pokemon getStarter() {
        int max = 4;
        int min = 1;

        switch ((int) Math.floor(Math.random() * (max - min + 1) + min)) {
            case 1:
                return new Swablu("Swablu", 30, 2, 1);
            case 2:
                return new Shellos("Shellos", 30, 2, 1);
            case 3:
                return new Riolu("Riolu", 30, 2, 1);
            default:
                return new Zorua("Zorua", 40, 2, 1);
        }
    }
}

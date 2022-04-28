package java_pokemon;

public class Spawns extends fight {
    public static void spawnMountain() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Bronzor("Bronzor", 45, 2, 1);
        } else if (starternumb == 7 || starternumb == 6) {
            spawnedPokemon = new Librava("Librava", 40, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Dedenne("Dedenne", 70, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Snom("Snom", 30, 2, 1);
        }

        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }

    public static void spawnCave() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Absol("Absol", 80, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Drilbur("Drillbur", 40, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Cutiefly("Cutiefly", 30, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Bronzor("Bronzor", 45, 2, 1);
        }

        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }

    public static void spawnGras() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Cutiefly("Cutiefly", 30, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Togedemaru("Togedemaru", 70, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Sizzlipede("Sizzlipede", 30, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Spoink("Spoink", 35, 2, 1);
        }
        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }

    public static void spawnForest() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Phantump("Phantump", 35, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Sizzlipede("Sizzlipede", 30, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Morelull("Morelull", 35, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Foongus("Foongus", 30, 2, 1);
        }

        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }

    public static void spawnLake() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Foongus("Foongus", 30, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Librava("Librava", 40, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Croagunk("Croagunk", 35, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Kabuto("Kabuto", 40, 2, 1);
        }
        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }

    public static void spawnVillage() {
        int max = 20;
        int min = 1;
        int max1 = 12;
        int min1 = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int pokenumb = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
        Pokemon spawnedPokemon = new Morpeko("Morpeko", 70, 2, 1);
        if (starternumb <= 5) {
            spawnedPokemon = new Morpeko("Morpeko", 40, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Absol("Absol", 40, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Croagunk("Croagunk", 35, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Skwovet("Skwovet", 30, 2, 1);
        }

        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }
}

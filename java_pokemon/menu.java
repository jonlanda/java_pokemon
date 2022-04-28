package java_pokemon;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        System.out.println("Welcome to Pokémon-Java.");
        Pokemon p1 = new Absol("Absol", 100, 2, 4);
        Pokemon p2 = new Morpeko("Morpeko", 100, 2, 2);

        System.out.println(p2.getHealth());
        p1.attack(1, p2);
        System.out.println(p2.getHealth());
        getStarter();
        selectPlace();
    }

    public static void getStarter() {
        int max = 4;
        int min = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Pokemon yourPokemon = new Swablu("Swablu", 30, 2, 1);
        switch (starternumb) {
            case 1:
                yourPokemon = new Swablu("Swablu", 30, 2, 1);
                break;
            case 2:
                yourPokemon = new Shellos("Shellos", 30, 2, 1);
                break;
            case 3:
                yourPokemon = new Riolu("Riolu", 30, 2, 1);
                break;
            case 4:
                yourPokemon = new Cutiefly("Cutiefly", 30, 2, 1);
                break;
        }
        System.out.println("Your starter Pokémon is: " + yourPokemon.getName() + "\n");
        showAttacks(yourPokemon);
    }

    public static void showAttacks(Pokemon yourPokemon) {
        System.out.println(" Here the list of its attacks: \n");
        for (Attack attack : yourPokemon.attacks) {
            System.out.print("  " + attack.getAttackName());
            System.out.print("  deals " + attack.getDmg() + " damage,");
            System.out.print("  costs " + attack.getEnergycost() + " energy and");
            System.out.println(" is effective against " + attack.getEffective());
        }
    }

    public static String getMap2() {
        String map = "+---------------------------------------------------------------------------------------+ \n" +
                "|Pongia-Map| 		                             					| \n" +
                "+----------+ 						+---------+			| \n" +
                "|	     						|   (P)   |			| \n" +
                "|	     			   +-----------+	|    	  |			| \n" +
                "| +-------+ 			   |'''''''''''| 	| Pongia  |			| \n" +
                "| |^^^^^^^|			   |'''''''''''|	| Village |			| \n" +
                "| |  (L)  |			   |'''''''''''|	|	  |			| \n" +
                "| | Lunar |		+----------+'''''''''''|	+---------+			| \n" +
                "| | Peak  |		|'''''''''(G)''''''''''|					| \n" +
                "| |^^^^^^^|		|   Grassy-Grassland   |		       +-------------+	| \n" +
                "| |^^^^^^^|		|''''''''''''''''''''''|		       |	     |	| \n" +
                "| |^^^^^^^|		+----------------------+		       |  	     |	| \n" +
                "| |^^^^^^^|							+------+	     |	| \n" +
                "| |^^^^^^^|							|		     |	| \n" +
                "| |^^^^^^^|			    +--------+			|	  (F)	     |	| \n" +
                "| |^^^^^^^+---------+		    |~~~~~~~~|			|     Foggy-Forest   |	| \n" +
                "| |^^^^^^^^^+------+|		+---+~~~~~~~~|			|		     |	| \n" +
                "| |^^^^^^^^^|  (D) ||		|~~~~~~~~~~~~+---------+	|		     |	| \n" +
                "| |^^^^^^^^^|Durkir||		|~~~~~~~~(L)~~~~~~~~~~~|	|		     |	| \n" +
                "| |^^^^^^^^^| Cave ||	     +--+   Loungie-Lake       |	+--------------------+	| \n" +
                "| |^^^^^^^^^+------+|	     |~~~~~~~~~~~~~~~~~~~~~~~~~|			        | \n" +
                "| +-----------------+	     +-------------------------+				| \n" +
                "+---------------------------------------------------------------------------------------+ \n";

        return (map);
    }

    public static void selectPlace() {
        Scanner placeW = new Scanner(System.in);
        System.out.println(getMap2());
        System.out.println("Where do you want to go?");
        String ortWahl = placeW.nextLine();
        switch (ortWahl.toUpperCase()) {
            case "L":
                spawnMountain();
                break;
            case "D":
                spawnCave();
                break;
            case "G":
                spawnGras();
                break;
            case "F":
                spawnForest();
                break;
            case "T":
                spawnLake();
                break;
            case "P":
                spawnVillage();
                break;
        }
    }

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
            spawnedPokemon = new Zorua("Zorua", 40, 2, 1);
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
            spawnedPokemon = new Zorua("Zorua", 40, 2, 1);
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
            spawnedPokemon = new Morpeko("Morpeko", 80, 2, 1);
        } else if (starternumb == 6 || starternumb == 7) {
            spawnedPokemon = new Absol("Absol", 80, 2, 1);
        } else if (starternumb >= 8 || starternumb <= 12) {
            spawnedPokemon = new Croagunk("Croagunk", 35, 2, 1);
        } else if (starternumb >= 13 || starternumb <= 20) {
            spawnedPokemon = new Skwovet("Skwovet", 30, 2, 1);
        }

        System.out.println("You encountered a wild " + spawnedPokemon.getName());
    }
}

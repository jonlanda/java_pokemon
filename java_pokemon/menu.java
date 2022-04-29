package java_pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class menu extends Spawns {
    public static void main(String[] args) {
        System.out.println("Welcome to Pokémon-Java.");
        Pokemon p1 = new Absol("Absol", 100, 2, 4);
        Pokemon p2 = new Morpeko("Morpeko", 100, 2, 2);

        System.out.println(p2.getHealth());
        p1.attack(1, p2);
        System.out.println(p2.getHealth());
        Trainer me = new Trainer();
        System.out.println("Your starter Pokémon is: " + me.team.get(0).getName() + "\n");
        selectPlace();
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
                "| |^^^^^^^^^|Durkir||		|~~~~~~~~(B)~~~~~~~~~~~|	|		     |	| \n" +
                "| |^^^^^^^^^| Cave ||	     +--+   Bubbly-Lake        |	+--------------------+	| \n" +
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
            case "B":
                spawnLake();
                break;
            case "P":
                spawnVillage();
                break;
        }
    }

}

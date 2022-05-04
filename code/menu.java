package code;

import java.util.ArrayList;
import java.util.Scanner;

public class menu extends Spawns {
    public static void main(String[] args) {
        System.out.println("Welcome to Pokémon-Java.");
        Trainer me = new Trainer();
        System.out.println("Your starter Pokémon is: " + Colors.BLUE + me.team.get(0).getName() + Colors.RESET + "\n");
        selectPlace();
    }

    public static String getMap2() {
        String map = "+---------------------------------------------------------------------------------------+\n" +
        "|Pongia-Map| 		                             		           / \\		|\n" +
        "+----------+ 					    +---------+	          /   \\	        |\n" +
        "|	     					    |   (P)   |	          | O | 	|\n" +
        "|	     			   +-----------+    |         |	          |   |  	|\n" +
        "| +-------+ 			   |'''''''''''|    | Pongia  |	    |\\_|\\_|   |_/|_/| 	|\n" +
        "| |^^^^^^^|			   |'''''''''''|    | Village |	    |__	        __  |   |\n" +
        "| |  (L)  |			   |'''''''''''|    |	      |	    |	   (C)	    |   |\n" +
        "| | Lunar |		+----------+'''''''''''|    +---------+	    | __ Champion __|   |\n" +
        "| | Peak  |		|'''''''''(G)''''''''''|		    |	 __	    |   |\n" +
        "| |^^^^^^^|		|   Grassy-Grassland   |		    +---------------+   |\n" +
        "| |^^^^^^^|		|''''''''''''''''''''''|		        	      	|\n" +
        "| |^^^^^^^|		+----------------------+		         	     	|\n" +
        "| |^^^^^^^|							+------+       +-----+	|\n" +
        "| |^^^^^^^|							|      |       |     |	|\n" +
        "| |^^^^^^^|			    +--------+			|      +-------+     |	|\n" +
        "| |^^^^^^^+---------+		    |~~~~~~~~|			|                    |	|\n" +
        "| |^^^^^^^^^+------+|		+---+~~~~~~~~|			|	 (F)	     |	|\n" +
        "| |^^^^^^^^^|  (D) ||		|~~~~~~~~~~~~+---------+	|    Foggy-Forest    |	|\n" +
        "| |^^^^^^^^^|Durkir||		|~~~~~~~~(L)~~~~~~~~~~~|	|	 	     |	|\n" +
        "| |^^^^^^^^^| Cave ||	     +--+   Loungie-Lake       |	+--------------------+	|\n" +
        "| |^^^^^^^^^+------+|	     |~~~~~~~~~~~~~~~~~~~~~~~~~|			        |\n" +
        "| +-----------------+	     +-------------------------+				|\n" +
        "+---------------------------------------------------------------------------------------+\n";

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
            case "C":
                Champ.readyForChamp();
                break;
            default:
                System.out.println("This Place does not exist!");
                selectPlace();
                break;
        }
    }

}

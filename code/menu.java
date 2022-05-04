package code;

import java.util.ArrayList;
import java.util.Scanner;

public class menu extends Spawns {
    public static void main(String[] args) {
        System.out.println("Welcome to Pokémon-Java.\n");
        System.out.println("Go to diffrent places on the map and fight the wild Pokémons.\n");
        System.out.println(
                "If you defeat it, you can catch it.\n\nAfter each fight your Pokémon will level up. Once your Pokémon reaches level 5 it will evolve.\n\nBuild your Team and defeat the Champion to become the new Pokémon-Java Champion! Good Luck!\n\n");
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

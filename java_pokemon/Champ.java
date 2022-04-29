package java_pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Champ {
    public ArrayList<Pokemon> Champteam;

    public Champ() {
        this.Champteam = new ArrayList<Pokemon>();
        this.Champteam.add(new Charizard("Charizard", 100, 19000, 25));
        this.Champteam.add(new Alakazam("Alakazam", 100, 19000, 25));
        this.Champteam.add(new Garchomp("Garchomp", 100, 19000, 25));
        this.Champteam.add(new Aegislash("Aegislash", 100, 19000, 25));
    }

    public static void readyForChamp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready to fight against the Champion of Pokemon-Java? Y/N \n");
        String choice = scan.nextLine();
        if (choice.toUpperCase() == "Y") {
            fightChamp();
        }
    }

    public static void fightChamp() {
        System.out.println("Hello Trainer! Im Daddy Shake and im the Champ of Pokemon-Java! " +
                "So you think you are strong enough to fight me?! Well let's see hehehe\n");
        System.out.println("Daddy Shake ");
        choosePokemon();

    }

    public static void choosePokemon() {
        Scanner myPkm = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");
        int b = 1;
        for (int i = 0; i < fight.team.size(); i++) {
            System.out.println(b + ") " + fight.team.get(i).getName());
            b++;
        }
        int PkmW = myPkm.nextInt() - 1;
        champPokemon1(PkmW);
    }

    public static void champPokemon1(int PkmW) {
        Pokemon champPokemon1 = new Charizard("Charizard", 100, 19000, 25);
        System.out.println(
                "Daddy Shake sends out " + Colors.RED + champPokemon1.getName() + Colors.RESET + " to battle.");
        fight.attackEnemy(champPokemon1, PkmW);
    }
}

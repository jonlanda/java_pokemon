package java_pokemon;

import java.util.Scanner;

public class fight extends Trainer {
    public static void fighting(Pokemon spawnedPokemon) {
        fightIntro(spawnedPokemon);

        Scanner myPkm = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");
        int b = 1;
        for(int i = 0; i < team.size(); i++) {
            System.out.println(b + ") " + team.get(i).getName());
            b++;
        }
        int PkmW = myPkm.nextInt() - 1;
        Scanner myAtk = new Scanner(System.in);

        System.out.println("Your Attacks: ");
        team.get(PkmW).showAttacks();
        int AtkW = myAtk.nextInt();
        switch(AtkW) {
            case 1:
                team.get(PkmW).attack(0, spawnedPokemon);
            case 2:
                team.get(PkmW).attack(1, spawnedPokemon);
        }
    }

    public static void fightIntro(Pokemon spawnedPokemon) {
        System.out.println("\nYou are fighting the wild " + spawnedPokemon.getName());
        System.out.println(" It has " + spawnedPokemon.getHealth() + " Health\n\n");
    }

    /*
    static int choosePokemon() {
        Scanner myPkm = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");
        int b = 1;
        for(int i = 0; i < team.size(); i++) {
            System.out.println(b + ") " + team.get(i).getName());
            b++;
        }
        int PkmW = myPkm.nextInt();
        return PkmW -1;
    }
    */
}

//System.out.println(spawnedPokemon.getHealth());
//team.get(0).attack(0, spawnedPokemon);
//System.out.println(spawnedPokemon.getHealth());

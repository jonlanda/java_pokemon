package java_pokemon;

import java.util.Scanner;

public class fight extends Trainer {
    public static void fighting(Pokemon spawnedPokemon) {
        System.out.println("You are fighting the wild " + spawnedPokemon.getName());
        Scanner myAtk = new Scanner(System.in);
        System.out.println("Your Attacks: ");
        team.get(0).showAttacks();

    }
}

//System.out.println(spawnedPokemon.getHealth());
//team.get(0).attack(0, spawnedPokemon);
//System.out.println(spawnedPokemon.getHealth());

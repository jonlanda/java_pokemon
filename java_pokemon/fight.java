package java_pokemon;

import java.util.Scanner;

public class fight extends Trainer {
    public static void attackYou(Pokemon spawnedPokemon, int PkmW) {
        fightIntro(spawnedPokemon);
        Scanner myAtk = new Scanner(System.in);

        System.out.println("Your Attacks: ");
        team.get(PkmW).showAttacks();
        int AtkW = myAtk.nextInt();
        switch(AtkW) {
            case 1:
                team.get(PkmW).attack(0, spawnedPokemon);
                System.out.println("The wild " + spawnedPokemon.getName() + " has " + spawnedPokemon.getHealth() + " Health left!");
                attackEnemy(spawnedPokemon, PkmW);
            case 2:
                team.get(PkmW).attack(1, spawnedPokemon);
                System.out.println("The wild " + spawnedPokemon.getName() + " has " + spawnedPokemon.getHealth() + " Health left!");
                attackEnemy(spawnedPokemon, PkmW);
            case 3:
                team.get(PkmW).attack(2, spawnedPokemon);
                System.out.println("The wild " + spawnedPokemon.getName() + " has " + spawnedPokemon.getHealth() + " Health left!");
                attackEnemy(spawnedPokemon, PkmW);
        }
    }

    public static void fightIntro(Pokemon spawnedPokemon) {
        System.out.println("\nYou are fighting the wild " + spawnedPokemon.getName());
        System.out.println(" It has " + spawnedPokemon.getHealth() + " Health\n\n");
    }

    public static void attackEnemy(Pokemon spawnedPokemon, int PkmW){
        int max = 15;
        int min = 1;
        int enemyAttack = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if(enemyAttack <= 8){
            spawnedPokemon.atkEne(0, team.get(PkmW));
            System.out.println(spawnedPokemon + " uses ");
            System.out.println("Your " + team.get(PkmW).getName() + " has " + team.get(PkmW).getHealth() + " Health");
            attackYou(spawnedPokemon, PkmW);
        } else if(enemyAttack > 8 && enemyAttack <= 12){
            spawnedPokemon.atkEne(1, team.get(PkmW));

            System.out.println("Your " + team.get(PkmW).getName() + " has " + team.get(PkmW).getHealth() + " Health");
            attackYou(spawnedPokemon, PkmW);
        }else{
            spawnedPokemon.atkEne(2, team.get(PkmW));
            System.out.println("Your " + team.get(PkmW).getName() + " has " + team.get(PkmW).getHealth() + " Health");
            attackYou(spawnedPokemon, PkmW);
        }

    }
    public static void choosePokemon(Pokemon spawnedPokemon) {
        Scanner myPkm = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");
        int b = 1;
        for(int i = 0; i < team.size(); i++) {
            System.out.println(b + ") " + team.get(i).getName());
            b++;
        }
        int PkmW = myPkm.nextInt() - 1;
        attackYou(spawnedPokemon, PkmW);
    }
}

//System.out.println(spawnedPokemon.getHealth());
//team.get(0).attack(0, spawnedPokemon);
//System.out.println(spawnedPokemon.getHealth());

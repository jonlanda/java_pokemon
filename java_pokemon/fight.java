package java_pokemon;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class fight extends Trainer {

    public static void attackYou(Pokemon spawnedPokemon, int PkmW) {
        fightIntro(spawnedPokemon, PkmW);
        Scanner myAtk = new Scanner(System.in);

        if (spawnedPokemon.getHealth() <= 0) {
            catchPokemon(spawnedPokemon, PkmW);
        }

        System.out.println("Your Attacks: ");
        team.get(PkmW).showAttacks();
        String AtkW = myAtk.nextLine();
        switch (AtkW.toUpperCase()) {
            case "1":
                team.get(PkmW).attack(0, spawnedPokemon);
                System.out.println(
                        "The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                                + spawnedPokemon.getHealth()
                                + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    catchPokemon(spawnedPokemon, PkmW);
                }
                attackEnemy(spawnedPokemon, PkmW);
            case "2":
                team.get(PkmW).attack(1, spawnedPokemon);
                System.out.println("The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                        + spawnedPokemon.getHealth()
                        + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    catchPokemon(spawnedPokemon, PkmW);
                }
                attackEnemy(spawnedPokemon, PkmW);
            case "3":
                team.get(PkmW).attack(2, spawnedPokemon);
                System.out.println(
                        "The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                                + spawnedPokemon.getHealth()
                                + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    catchPokemon(spawnedPokemon, PkmW);
                }
                attackEnemy(spawnedPokemon, PkmW);
        }
    }

    public static void fightIntro(Pokemon spawnedPokemon, int PkmW) {
        System.out.println("\n\n---------------------------------------------------------------------------\n");
        System.out.println("\nYou are fighting the wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET);
        System.out.println(" It has " + spawnedPokemon.getHealth() + " Health\n");
        System.out.println("You have " + Colors.YELLOW + team.get(PkmW).getEnergy() + Colors.RESET +" Energy left!\n");
        System.out.println("Your " + Colors.BLUE + team.get(PkmW).getName() + Colors.RESET + " has " + Colors.GREEN + team.get(PkmW).getHealth() + Colors.RESET + " Health left!\n\n");
    }

    public static void attackEnemy(Pokemon spawnedPokemon, int PkmW) {
        int max = 15;
        int min = 1;
        int enemyAttack = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (enemyAttack <= 8) {
            spawnedPokemon.atkEne(0, team.get(PkmW));
            System.out.println("The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(0).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(0).getDmg() + " damage! \n");
            System.out.println("Your " + team.get(PkmW).getName() + " has "+ Colors.GREEN +team.get(PkmW).getHealth() + Colors.RESET +" Health");
            diePokemon(PkmW, spawnedPokemon);
            attackYou(spawnedPokemon, PkmW);
        } else if (enemyAttack > 8 && enemyAttack <= 12) {
            spawnedPokemon.atkEne(1, team.get(PkmW));
            System.out.println("The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(1).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(1).getDmg() + " damage! \n");
            System.out.println("Your " + team.get(PkmW).getName() + " has "+ Colors.GREEN +team.get(PkmW).getHealth() + Colors.RESET +" Health");
            diePokemon(PkmW, spawnedPokemon);
            attackYou(spawnedPokemon, PkmW);
        } else {
            spawnedPokemon.atkEne(2, team.get(PkmW));
            System.out.println("The wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(2).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(2).getDmg() + " damage! \n");
            System.out.println("Your " + team.get(PkmW).getName() + " has " + Colors.GREEN +team.get(PkmW).getHealth() + Colors.RESET +" Health");
            diePokemon(PkmW, spawnedPokemon);

            attackYou(spawnedPokemon, PkmW);
        }

    }

    public static void choosePokemon(Pokemon spawnedPokemon) {
        Scanner myPkm = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");
        int b = 1;
        for (int i = 0; i < team.size(); i++) {
            System.out.println(b + ") " + team.get(i).getName());
            b++;
        }
        int PkmW = myPkm.nextInt() - 1;
        attackYou(spawnedPokemon, PkmW);
    }

    public static void run(Pokemon spawnedPokemon) {
        Scanner run = new Scanner(System.in);
        System.out.println("Do you want to run away? Y/N");
        String runA = run.nextLine();
        switch(runA.toUpperCase()) {
            case "Y":
                System.out.println(Colors.GREEN + "You got away safely\n" + Colors.RESET);
                menu.getMap2();
                menu.selectPlace();
                break;
            case "N":
                choosePokemon(spawnedPokemon);
                break;
        }
    }

    public static void catchPokemon(Pokemon spawnedPokemon, int PkmW) {
        Scanner myPkm = new Scanner(System.in);
        System.out.println(
                "Do you want to catch the wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " Y/N");
        String PkmC = myPkm.nextLine();
        switch(PkmC.toUpperCase()) {
            case "Y":
                if (team.size() >= 6) {
                    System.out.println("Sorry you cant add more Pokemons to your Team!");
                } else {
                    spawnedPokemon.heal();
                    team.add(spawnedPokemon);
                    System.out.println("You caught the wild " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + "!\n\n");
                    team.get(PkmW).heal();
                    team.get(PkmW).getLevelUp(PkmW);
                }
                Champ.readyForChamp();
                menu.getMap2();
                menu.selectPlace();
            case "N":
                team.get(PkmW).heal();
                team.get(PkmW).getLevelUp(PkmW);
                Champ.readyForChamp();
                menu.getMap2();
                menu.selectPlace();
        }
    }

    public static void diePokemon(int PkmW, Pokemon spawnedPokemon) {
    if (team.get(PkmW).getHealth() <= 0) {
        System.out.println("Oh no your " + team.get(PkmW).getName() + " fainted!");
        team.remove(PkmW);
        dieTeam();
        choosePokemon(spawnedPokemon);
    }
    }

    public static void dieTeam() {
        if (team.size() == 0) {
            System.out.println(Colors.RED + "\nSeems like your entire Team fainted!\nSee you on the next try!" + Colors.RESET);
            System.exit(0);
        }
    }
}

// System.out.println(spawnedPokemon.getHealth());
// team.get(0).attack(0, spawnedPokemon);
// System.out.println(spawnedPokemon.getHealth());

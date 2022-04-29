package java_pokemon;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Champ {
    public static int count = 0;
    public ArrayList<Pokemon> Champteam;

    public Champ() {
        this.Champteam.add(new Garchomp("Garchomp", 100, 19000, 25));
        this.Champteam.add(new Aegislash("Aegislash", 100, 19000, 25));
    }

    public static void readyForChamp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready to fight against the Champion of Pokemon-Java? Y/N \n");
        String choice = scan.nextLine();
        switch (choice.toUpperCase()) {
            case "Y":
                fightChamp();
            case "N":
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
        attackYouChamp(champPokemon1, PkmW);
    }

    public static void champPokemon2(int PkmW) {
        Pokemon champPokemon2 = new Alakazam("Alakazam", 100, 19000, 25);
        System.out.println(
                "Daddy Shake sends out " + Colors.RED + champPokemon2.getName() + Colors.RESET + " to battle.");
        attackYouChamp(champPokemon2, PkmW);
    }

    public static void champPokemon3(int PkmW) {
        Pokemon champPokemon3 = new Garchomp("Garchomp", 100, 19000, 25);
        System.out.println(
                "Daddy Shake sends out " + Colors.RED + champPokemon3.getName() + Colors.RESET + " to battle.");
        attackYouChamp(champPokemon3, PkmW);
    }

    public static void champPokemon4(int PkmW) {
        Pokemon champPokemon4 = new Aegislash("Aegislash", 100, 19000, 25);
        System.out.println(
                "Daddy Shake sends out " + Colors.RED + champPokemon4.getName() + Colors.RESET + " to battle.");
        attackYouChamp(champPokemon4, PkmW);
    }

    public static void attackEnemyChamp(Pokemon spawnedPokemon, int PkmW) {
        int max = 15;
        int min = 1;
        int enemyAttack = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (enemyAttack <= 8) {
            spawnedPokemon.atkEne(0, fight.team.get(PkmW));
            System.out.println("Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(0).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(0).getDmg() + " damage! \n");
            System.out.println("Your " + fight.team.get(PkmW).getName() + " has " + Colors.GREEN
                    + fight.team.get(PkmW).getHealth() + Colors.RESET + " Health");
            fight.diePokemon(PkmW, spawnedPokemon);
            attackYouChamp(spawnedPokemon, PkmW);
        } else if (enemyAttack > 8 && enemyAttack <= 12) {
            spawnedPokemon.atkEne(1, fight.team.get(PkmW));
            System.out.println("Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(1).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(1).getDmg() + " damage! \n");
            System.out.println("Your " + fight.team.get(PkmW).getName() + " has " + Colors.GREEN
                    + fight.team.get(PkmW).getHealth() + Colors.RESET + " Health");
            fight.diePokemon(PkmW, spawnedPokemon);
            attackYouChamp(spawnedPokemon, PkmW);
        } else {
            spawnedPokemon.atkEne(2, fight.team.get(PkmW));
            System.out.println("Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " uses "
                    + spawnedPokemon.attacks.get(2).getAttackName() + " and deals "
                    + spawnedPokemon.attacks.get(2).getDmg() + " damage! \n");
            System.out.println("Your " + fight.team.get(PkmW).getName() + " has " + Colors.GREEN
                    + fight.team.get(PkmW).getHealth() + Colors.RESET + " Health");
            fight.diePokemon(PkmW, spawnedPokemon);

            attackYouChamp(spawnedPokemon, PkmW);
        }

    }

    public static void attackYouChamp(Pokemon spawnedPokemon, int PkmW) {
        fightIntroChamp(spawnedPokemon, PkmW);
        Scanner myAtk = new Scanner(System.in);

        if (spawnedPokemon.getHealth() <= 0) {
            champPokemon2(PkmW);
        }

        System.out.println("Your Attacks: ");
        fight.team.get(PkmW).showAttacks();
        int AtkW = myAtk.nextInt();
        switch (AtkW) {
            case 1:
                fight.team.get(PkmW).attack(0, spawnedPokemon);
                System.out.println(
                        "Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                                + spawnedPokemon.getHealth()
                                + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    count++;
                    if (count == 1) {
                        champPokemon2(PkmW);
                    } else if (count == 2) {
                        champPokemon3(PkmW);
                    } else if (count == 3) {
                        champPokemon4(PkmW);
                    } else {
                        System.out.println(
                                "Congratulations! You are the new Pokemon-Java Champion! Jon and Denis are very proud of you! Thanks for playing. :)");
                        System.exit(0);
                    }
                }
                attackEnemyChamp(spawnedPokemon, PkmW);
            case 2:
                fight.team.get(PkmW).attack(1, spawnedPokemon);
                System.out.println("Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                        + spawnedPokemon.getHealth()
                        + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    count++;
                    if (count == 1) {
                        champPokemon2(PkmW);
                    } else if (count == 2) {
                        champPokemon3(PkmW);
                    } else if (count == 3) {
                        champPokemon4(PkmW);
                    } else {
                        System.out.println(
                                "Congratulations! You are the new Pokemon-Java Champion! Jon and Denis are very proud of you! Thanks for playing. :)");
                        System.exit(0);
                    }
                }
                attackEnemyChamp(spawnedPokemon, PkmW);
            case 3:
                fight.team.get(PkmW).attack(2, spawnedPokemon);
                System.out.println(
                        "Daddy Shake's" + Colors.RED + spawnedPokemon.getName() + Colors.RESET + " has "
                                + spawnedPokemon.getHealth()
                                + " Health left!\n");
                if (spawnedPokemon.getHealth() <= 0) {
                    count++;
                    if (count == 1) {
                        champPokemon2(PkmW);
                    } else if (count == 2) {
                        champPokemon3(PkmW);
                    } else if (count == 3) {
                        champPokemon4(PkmW);
                    } else {
                        System.out.println(
                                "Congratulations! You are the new Pokemon-Java Champion! Jon and Denis are very proud of you! Thanks for playing. :)");
                        System.exit(0);
                    }
                }
                attackEnemyChamp(spawnedPokemon, PkmW);
        }
        if (spawnedPokemon.getHealth() <= 0) {
            count++;
            if (count == 1) {
                champPokemon2(PkmW);
            } else if (count == 2) {
                champPokemon3(PkmW);
            } else if (count == 3) {
                champPokemon4(PkmW);
            } else {
                System.out.println(
                        "Congratulations! You are the new Pokemon-Java Champion! Jon and Denis are very proud of you! Thanks for playing. :)");
                System.exit(0);
            }
        }
    }

    public static void fightIntroChamp(Pokemon spawnedPokemon, int PkmW) {
        System.out.println("\n\n---------------------------------------------------------------------------\n");
        System.out.println("\nYou are fighting Daddy Shake's " + Colors.RED + spawnedPokemon.getName() + Colors.RESET);
        System.out.println(" It has " + spawnedPokemon.getHealth() + " Health\n");
        System.out.println(
                "You have " + Colors.YELLOW + fight.team.get(PkmW).getEnergy() + Colors.RESET + " Energy left!\n");
        System.out
                .println("Your " + Colors.BLUE + fight.team.get(PkmW).getName() + Colors.RESET + " has " + Colors.GREEN
                        + fight.team.get(PkmW).getHealth() + Colors.RESET + " Health left!\n\n");
    }

}

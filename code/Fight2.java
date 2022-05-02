package code;
/*
package java_pokemon;

import java.util.Scanner;

public class Fight2 {
    public Trainer trainer;
    public Pokemon enemy;
    public Pokemon friendly;
    public boolean isEnemyTurn;

    public Fight2(Trainer trainer, Pokemon enemy) {
        this.trainer = trainer;
        this.enemy = enemy;
        this.isEnemyTurn = false;
    }

    public boolean turn() {
        if(isEnemyTurn) {
            attackEnemy();
        } else {
            
            fightIntro();
            attackYou();

            if (enemy.getHealth() <= 0) {
                catchPokemon();
                return true;
            }
        }

        return enemy.getHealth() <= 0 || friendly.getHealth() <= 0;
    }

    public void fightIntro() {
        System.out.println("\n\n---------------------------------------------------------------------------\n");
        System.out.println("\nYou are fighting the wild " + enemy.getName());
        System.out.println(" It has " + enemy.getHealth() + " Health\n");
        System.out.println("You have " + friendly.getEnergy() + " Energy left!\n\n");
    }

    public void attackYou() {
        Scanner in = new Scanner(System.in);

        System.out.println("Your Attacks: ");
        friendly.showAttacks();

        int choice = in.nextInt();
        friendly.attack(choice - 1, enemy);
        System.out.println("The wild " + enemy.getName() + " has " + enemy.getHealth() + " Health left!\n");
    }

    
    public void attackEnemy() {
        int max = 15;
        int min = 1;
        int enemyAttack = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if(enemyAttack < 8) {
            enemyAttack = 0;
        } else if(enemyAttack < 12) {
            enemyAttack = 1;
        } else {
            enemyAttack = 2;
        }

        enemy.atkEne(enemyAttack,friendly);
        System.out.println("The wild " + enemy.getName() + " uses "
                + enemy.attacks.get(enemyAttack).getAttackName() + " and deals "
                + enemy.attacks.get(enemyAttack).getDmg() + " damage! \n");
        System.out.println("Your " + friendly.getName() + " has " + friendly.getHealth() + " Health");
    }

    public boolean catchPokemon() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to catch the wild " + enemy.getName() + " Y/N");
        String choice = in.nextLine();

        if (choice.toUpperCase() != "Y") return false;
    
        Trainer.team.add(enemy);
        enemy.heal();
        return true;
    }

    public void choosePokemon() {
        Scanner in = new Scanner(System.in);
        System.out.println("What Pokemon do you want to use?");

        for (int i = 0; i < Trainer.team.size(); i++) {
            System.out.println(i + 1 + ") " + Trainer.team.get(i).getName());
        }
        int choice = in.nextInt() - 1;
        this.friendly = Trainer.team.get(choice);
    }
}
*/
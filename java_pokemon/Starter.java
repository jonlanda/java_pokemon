package java_pokemon;

import java.util.ArrayList;

public class Starter {
    public static void getStarter() {
        ArrayList<Pokemon> teampokemon = new ArrayList<Pokemon>();
        int max = 4;
        int min = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Pokemon yourPokemon = new Swablu("Swablu", 30, 2, 1);
        switch (starternumb) {
            case 1:
                yourPokemon = new Swablu("Swablu", 30, 2, 1);
                teampokemon.add(yourPokemon);
                break;
            case 2:
                yourPokemon = new Shellos("Shellos", 30, 2, 1);
                teampokemon.add(yourPokemon);
                break;
            case 3:
                yourPokemon = new Riolu("Riolu", 30, 2, 1);
                teampokemon.add(yourPokemon);
                break;
            case 4:
                yourPokemon = new Zorua("Zorua", 40, 2, 1);
                teampokemon.add(yourPokemon);
                break;
        }
        System.out.println("Your starter Pokémon is: " + yourPokemon.getName() + "\n");
        showAttacks(teampokemon.get(0));
    }

    public static void showAttacks(Pokemon yourPokemon) {
        System.out.println(" Here the list of its attacks: \n");
        for (Attack attack : yourPokemon.attacks) {
            System.out.print("  " + attack.getAttackName());
            System.out.print("  deals " + attack.getDmg() + " damage,");
            System.out.print("  costs " + attack.getEnergycost() + " energy and");
            System.out.println(" is effective against " + attack.getEffective());
        }
    }
}

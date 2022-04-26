package java_pokemon;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        System.out.println("Welcome to Pokémon-Java");
        Pokemon p1 = new Absol("Absol", 100 , 2, 4);
        Pokemon p2 = new Morpeko("Morpeko", 100, 2, 2);

        System.out.println(p2.getHealth());
        p1.attack(1, p2);
        System.out.println(p2.getHealth());
        getStarter();
    }

    public static void getStarter() {
        int max = 4;
        int min = 1;
        int starternumb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Pokemon yourPokemon = new Swablu("Swablu", 70, 2, 1);
        switch (starternumb) {
            case 1:
                yourPokemon = new Swablu("Swablu", 70, 2, 1);
                break;
            case 2:
                yourPokemon = new Shellos("Shellos", 70, 2, 1);
                break;
            case 3:
                yourPokemon = new Riolu("Riolu", 70, 2, 1);
                break;
            case 4:
                yourPokemon = new Cutiefly("Cutiefly", 70, 2, 1);
                break;
        }
        System.out.println("Your starter Pokémon is: " + yourPokemon.getName());
        showAttacks(yourPokemon);
    }

    public static void showAttacks(Pokemon yourPokemon) {
        System.out.println("Your Attacks are: " + yourPokemon.getAttacks());
    }
}

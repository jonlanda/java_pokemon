package java_pokemon;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Pokemon p1 = new Absol("Absol", 100 , 2, 4);
        Pokemon p2 = new Morpeko("Morpeko", 100, 2, 2);

        System.out.println(p2.getHealth());
        p1.attack(1, p2);
        System.out.println(p2.getHealth());
    }
}

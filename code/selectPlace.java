package code;

import java.util.Scanner;

public class selectPlace {
    public static void selectPlace() {
        System.out.println("Welcome to Pokemon-Java");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Where do you want to go?");
        System.out.println("(1) Lake");
        System.out.println("(2) Forest");
        System.out.println("(3) Field");
        System.out.println("(4) Mountain");
        System.out.println("(5) Cave");
        System.out.println("(6)");
        int ortw = myObj.nextInt();
    }
}

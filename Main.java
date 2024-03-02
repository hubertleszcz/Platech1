package org.example;
import org.example.Mage;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        Mage mage = new Mage("Robert", 11, 20.6);
        System.out.print(mage.toString());
        System.out.print(mage.hashCode());
    }
}
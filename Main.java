package org.example;
import org.example.Mage;


import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<Mage> mageSet;
        Map<Mage, Integer> mageMap;
        if (args[0].equals("0")) {
            mageSet = new HashSet<>();
            mageMap = new HashMap<>();
        }

        else if (args[0].equals("1")){
            mageSet = new TreeSet<>();
            mageMap = new TreeMap<>();
        }
        else{
            mageSet = new TreeSet<>(new mageCompare());
            mageMap = new TreeMap<>(new mageCompare());
        }
        Mage firstMainMage = new Mage("Dewastator5000", 16, 22.6, args[0]);
        Mage secondMainMage = new Mage("UltraKoxu12", 14, 15.4, args[0]);
        Mage thirdMainMage = new Mage("Leszcz", 21, 8.5, args[0]);
        Mage firstApprentice = new Mage("Turbosprezarka221", 7, 5.5, args[0]);
        Mage secondApprentice = new Mage("Godzilla404", 6, 4.5, args[0]);
        Mage thirdApprentice = new Mage("SuperCzarodziej123", 9, 3.5, args[0]);
        Mage forthApprentice = new Mage("SuperCzarodziej1234", 2, 2.0, args[0]);
        Mage fifthApprentice = new Mage("GigaChad15", 100, 100.5, args[0]);
        Mage firstSubApprentice = new Mage("Slaby1", 1, 1.0, args[0]);
        Mage secondSubApprentice = new Mage("Slaby2", 1, 1.1, args[0]);


        firstApprentice.getApprentices().add(firstSubApprentice);
        firstApprentice.getApprentices().add(secondSubApprentice);
        firstMainMage.getApprentices().add(firstApprentice);
        firstMainMage.getApprentices().add(secondApprentice);

        secondMainMage.getApprentices().add(thirdApprentice);
        secondMainMage.getApprentices().add(fifthApprentice);
        thirdMainMage.getApprentices().add(forthApprentice);

        mageSet.add(firstMainMage);
        mageSet.add(secondMainMage);
        mageSet.add(thirdMainMage);

        for(Mage mage: mageSet){
            mage.recursivePrintOut(0);
        }

        System.out.print(firstApprentice.getApprenticeCount());
    }
}
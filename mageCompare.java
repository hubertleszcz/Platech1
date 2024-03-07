package org.example;

import java.util.Comparator;

public class mageCompare implements Comparator<Mage> {
    @Override
    public int compare(Mage first, Mage second){
        if(Integer.compare(first.getLevel(), second.getLevel())!=0) return Integer.compare(first.getLevel(), second.getLevel());
        else if(first.getName().compareTo(second.getName()) != 0) return first.getName().compareTo(second.getName());

        return Double.compare(first.getPower(), second.getPower());
    }
}

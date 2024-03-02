package org.example;

public interface Comparator {
    public default boolean secondCompare(Mage firstMage, Mage secondMage){
        if(firstMage.getLevel() < secondMage.getLevel()) return false;
        else{
            if(firstMage.getLevel() > secondMage.getLevel()) return true;
            else{
                if(firstMage.getName().compareTo(secondMage.getName()) < 0) return false;
                else{
                    if(firstMage.getName().compareTo(secondMage.getName()) > 0) return true;
                    else return firstMage.getPower() > secondMage.getPower();
                }
            }
        }
    }
}

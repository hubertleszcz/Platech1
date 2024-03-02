package org.example;

public interface Comparable {
    public default boolean greaterThan(Mage firstMage, Mage secondMage){
        if(firstMage.getName().compareTo(secondMage.getName()) < 0){
            return false;
        }
        else{
            if(firstMage.getName().compareTo(secondMage.getName()) > 0){
                return false;
            }
            else{
                if(firstMage.getLevel() < secondMage.getLevel()) return false;
                else{
                    if(firstMage.getLevel() > secondMage.getLevel()) return true;
                    else return firstMage.getPower() > secondMage.getPower();
                }
            }

        }
    }

    boolean equals(Mage otherMage);
}

package org.example;
import java.util.Set;
public class Mage implements Comparable, Comparator{
    private final String name;
    private final int level;
    private final double power;

    private Set<Mage> apprentices;

    public String getName(){ return this.name;}

    public int getLevel(){return this.level;};

    public double getPower() {return this.power;}

    public Mage(String name, int level, double power){
        this.level = level;
        this.name = name;
        this.power = power;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Mage otherMage){
        if(this.name.equals(otherMage.getName())
                && this.power == otherMage.getPower()
                && this.level == otherMage.getLevel() ) {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String result = "Mage{name='" + this.name + "', level=" +
                Integer.toString(this.level) + ", power = " + Double.toString(this.power) + " }";
        return result;
    }
}

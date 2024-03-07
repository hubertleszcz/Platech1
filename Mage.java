package org.example;

import java.util.*;

public class Mage implements Comparable{
    private final String name;
    private final int level;
    private final double power;

    private Set<Mage> apprentices;

    public String getName(){ return this.name;}

    public int getLevel(){return this.level;};

    public Set<Mage> getApprentices(){
        return this.apprentices;
    }
    public double getPower() {return this.power;}

    public Mage(String name, int level, double power, String setType){
        this.level = level;
        this.name = name;
        this.power = power;
        if(setType.equals("0")) this.apprentices = new HashSet<>();
        else if(setType.equals("1")) this.apprentices = new TreeSet<>();
        else this.apprentices = new TreeSet<>(new mageCompare());
    }

    @Override
    public int hashCode() {
        return (int) ((1601*(this.level << 3) * (this.power * 16))%757);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mage mage = (Mage) o;
        return level == mage.level && Double.compare(mage.power, power) == 0 && Objects.equals(name, mage.name);
    }

    public String toString(){
        String result = "Mage{name='" + this.name + "', level=" +
                Integer.toString(this.level) + ", power = " + Double.toString(this.power) + " }";
        return result;
    }

    @Override
    public int compareTo(Object obj){
        return 0;
    }

    public void recursivePrintOut(int recursionDepth){
        StringBuilder out = new StringBuilder();
        for(int i=0;i<recursionDepth;i++) out.append('-');
        out.append(this.toString());
        System.out.print(out + "\n");
        for(var mage: this.apprentices){
            mage.recursivePrintOut(recursionDepth+1);
        }
    }
}
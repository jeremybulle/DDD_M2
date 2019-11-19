package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class TownSet{
    private Set<Town> setTown = new HashSet<Town>();
    private TownFactory tf = new TownFactory();

    public TownSet(){
        Town newTown = tf.getNextTown();

        while(newTown != null){
            setTown.add(newTown);
            newTown = tf.getNextTown();
        }
    }

    public boolean contains(Town town){
        return setTown.contains(town);
    }

    public void displayTown(){
        for(Town town : setTown){
            System.out.println(town.getName());
        }
    }

    public static void main(String[] args) {
        TownSet townSet = new TownSet();
        townSet.displayTown();
    }
}
package com.example.daniel.zoomanager;

import java.util.ArrayList;

/**
 * Created by Daniel on 10/11/2017.
 */

public class Zoo<E extends Enclosure> {

    private double funds;
    private ArrayList<E> enclosures;

    public Zoo() {
        this.funds = 0.00;
        this.enclosures = new ArrayList<>();
    }

    public double getFunds() {
        return this.funds;
    }


    public int getNumberOfEnclosures() {
        return this.enclosures.size();
    }

    public void addEnclosure(E enclosure) {
        this.enclosures.add(enclosure);
    }

    public void removeEnclosure(E enclosure) {
        this.enclosures.remove(enclosure);
    }

    public int countAnimals() {
        int total = 0;
        for (E enclosure : enclosures) {
            total =+ enclosure.getNumberOfAnimals();
        }
        return total;
    }
}


//    A Zoo should have a collection of generic Enclosures that can take Animals of any particular type. An Enclosure should only be able to hold Animals of one type.
//
//        A Zoo should be able add and remove Enclosures.
//
//        A Zoo should be able to calculate the total number of Animals within it's enclosures.
//
//        A Zoo should be able to sell an Animal, removing them from their Enclosure (hint: You will have to figure out which enclosure the Animal is in first. The ArrayList's contains() method might help) and receiving some money in exhange for them.
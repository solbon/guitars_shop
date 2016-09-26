package com.example;

import com.example.enums.Builder;
import com.example.enums.Type;
import com.example.enums.Wood;

import java.util.List;

/**
 * Created by sdaribazaron on 2016-09-23.
 */
public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List<Guitar> guitars = inventory.search(whatErinLikes);

        if (guitars.size() != 0) {
            System.out.println("Erin, you might like these guitars: ");
            for (Guitar guitar : guitars) {
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println("We have a " +
                        guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                        guitarSpec.getType() + " guitar:\n " +
                        guitarSpec.getBackWood() + " back and sides, \n " +
                        guitarSpec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        // add guitars ...
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
    }
}


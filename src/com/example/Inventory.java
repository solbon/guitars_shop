package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdaribazaron on 2016-09-23.
 */
public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> list = new ArrayList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec spec = guitar.getSpec();
            if (searchSpec.getBuilder() != spec.getBuilder())
                continue;
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.isEmpty()) && !model.equals(spec.getModel().toLowerCase()))
                continue;
            if (searchSpec.getType() != spec.getType())
                continue;
            if (searchSpec.getBackWood() != spec.getBackWood())
                continue;
            if (searchSpec.getTopWood() != spec.getTopWood())
                continue;
            list.add(guitar);
        }
        return list;
    }

}

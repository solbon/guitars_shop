package com.example;

import com.example.enums.Builder;
import com.example.enums.Type;
import com.example.enums.Wood;

/**
 * Created by xyz on 2016-09-23.
 */
public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuitarSpec that = (GuitarSpec) o;

        if (numStrings != that.numStrings) return false;
        if (builder != that.builder) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (type != that.type) return false;
        if (backWood != that.backWood) return false;
        return topWood == that.topWood;

    }

    @Override
    public int hashCode() {
        int result = builder != null ? builder.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (backWood != null ? backWood.hashCode() : 0);
        result = 31 * result + (topWood != null ? topWood.hashCode() : 0);
        result = 31 * result + numStrings;
        return result;
    }
}

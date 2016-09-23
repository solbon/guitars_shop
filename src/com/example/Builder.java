package com.example;

/**
 * Created by xyz on 2016-09-23.
 */
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER:    return "Fender";
            case GIBSON:    return "Gibson";
            case MARTIN:    return "Martin";
            case COLLINGS:    return "Collings";
            case OLSON:    return "Olson";
            case RYAN:    return "Ryan";
            case PRS:    return "Prs";
            case ANY:    return "Any";
        }
        return null;
    }
}

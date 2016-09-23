package com.example;

/**
 * Created by xyz on 2016-09-23.
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACOUSTIC:    return "Acoustic";
            case ELECTRIC:    return "Electric";
        }
        return null;
    }
}

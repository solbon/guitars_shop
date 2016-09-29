package com.example;

/**
 * Created by xyz on 2016-09-26.
 */
public class DogDoor {
    private boolean open;

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}

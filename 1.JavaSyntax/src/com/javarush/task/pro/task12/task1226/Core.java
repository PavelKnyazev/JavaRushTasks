package com.javarush.task.pro.task12.task1226;

public class Core {

    private final int coreNumber;

    public Core(int coreNumber) {
        this.coreNumber = coreNumber;
    }

    public int getCoreNumber() {
        return coreNumber;
    }

    @Override
    public String toString() {
        return "{coreNumber=" + coreNumber + "} ";
    }

}
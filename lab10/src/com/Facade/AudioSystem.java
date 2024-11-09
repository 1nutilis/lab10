package com.Facade;

public class AudioSystem {
    public void turnOn() {
        System.out.println("Audio system is turned on.");
    }
    public void turnOff() {
        System.out.println("Audio system is turned off.");
    }
    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }
}


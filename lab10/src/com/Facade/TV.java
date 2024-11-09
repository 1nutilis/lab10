package com.Facade;

public class TV {
    public void turnOn() {
        System.out.println("TV is turned on.");
    }
    public void turnOff() {
        System.out.println("TV is turned off.");
    }
    public void setChannel(int channel) {
        System.out.println("Channel set to " + channel);
    }
}

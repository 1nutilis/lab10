package com.Facade;

public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole console;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }

    public void watchMovie() {
        System.out.println("Preparing to watch a movie...");
        tv.turnOn();
        audio.turnOn();
        audio.setVolume(7);
        dvd.play();
    }

    public void endMovie() {
        System.out.println("Shutting down movie mode...");
        dvd.stop();
        audio.turnOff();
        tv.turnOff();
    }

    public void playGame(String game) {
        System.out.println("Starting game mode...");
        tv.turnOn();
        console.turnOn();
        console.playGame(game);
    }

    public void endGame() {
        System.out.println("Shutting down game mode...");
        console.turnOff();
        tv.turnOff();
    }
}

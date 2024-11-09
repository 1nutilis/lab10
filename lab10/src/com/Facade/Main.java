package com.Facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audio, dvd, console);

        homeTheater.watchMovie();
        System.out.println();
        homeTheater.endMovie();

        System.out.println();

        homeTheater.playGame("Super Mario");
        System.out.println();
        homeTheater.endGame();
    }
}


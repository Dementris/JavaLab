package org.lab11.labwork9;

/**
 * Class Game - the Main class.
 */
public class Game {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new FirstSave());
        GameWorld gameWorld = director.buildGame();

        System.out.println(gameWorld);
        director.setBuilder(new SecondSave());
        gameWorld = director.buildGame();

        System.out.println(gameWorld);
    }
}

package org.lab11.labwork9;

/**
 * Class Director has field builder.
 */
public class Director {
    /**
     * The Builder.
     */
    GameWorldBuilder builder;

    /**
     * Method setBuilder() sets downloadable file..
     *
     * @param builder the builder
     */
    public void setBuilder(GameWorldBuilder builder) {
        this.builder = builder;
    }

    /**
     * Method buildGame() download game settings from file.
     *
     * @return the game world
     */
    GameWorld buildGame(){
        builder.createGameWorld();
        builder.buildName();
        builder.buildDifficult();
        builder.buildScore();
        builder.buildPlayer();
        return builder.getGameWorld();
    }
}

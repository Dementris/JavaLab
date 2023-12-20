package org.lab11.labwork9;

/**
 * Abstract class GameWorldBuilder has field gameWorld.
 */
public abstract class GameWorldBuilder {
    /**
     * The Game world.
     */
    GameWorld gameWorld;


    /**
     * Create game world.
     */
    void createGameWorld(){
        gameWorld = new GameWorld();
    }

    /**
     * Build name.
     */
    abstract void buildName();

    /**
     * Build difficult.
     */
    abstract void buildDifficult();

    /**
     * Build score.
     */
    abstract void buildScore();

    /**
     * Build player.
     */
    abstract void buildPlayer();

    /**
     * Get game world game world.
     *
     * @return the game world
     */
    GameWorld getGameWorld(){
        return gameWorld;
    }
}

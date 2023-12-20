package org.lab11.labwork9;

/**
 * Class FirstSave extends GameWorldBuilder
 *
 */
public class FirstSave extends GameWorldBuilder{



    @Override
    void buildName() {
        gameWorld.setName("First save");
    }

    @Override
    void buildDifficult() {
        gameWorld.setDificult(Dificult.HARD);
    }

    @Override
    void buildScore() {
        gameWorld.setScore(350);
    }

    @Override
    void buildPlayer() {
        gameWorld.setPlayer(new Player("John",100,0,-1));
    }
}

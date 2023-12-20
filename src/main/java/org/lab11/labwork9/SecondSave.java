package org.lab11.labwork9;

/**
 * Class SecondSave extends GameWorldBuilder.
 */
public class SecondSave extends GameWorldBuilder{

    @Override
    void buildName() {
        gameWorld.setName("Second Save");
    }

    @Override
    void buildDifficult() {
        gameWorld.setDificult(Dificult.LIGHT);
    }

    @Override
    void buildScore() {
        gameWorld.setScore(1056);
    }

    @Override
    void buildPlayer() {
        gameWorld.setPlayer(new Player("Steve",455,87,123));
    }
}

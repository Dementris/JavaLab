package org.lab11.labwork9;

/**
 * Class Player has fields name, health, posX and posY.
 */
public class Player {
    /**
     * The Name.
     */
    String name;
    /**
     * The Health.
     */
    int health;
    /**
     * The Pos x.
     */
    int posX;
    /**
     * The Pos y.
     */
    int posY;

    /**
     * Instantiates a new Player.
     *
     * @param name   the name
     * @param health the health
     * @param posX   the pos x
     * @param posY   the pos y
     */
    public Player(String name, int health, int posX, int posY) {
        this.name = name;
        this.health = health;
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}

package org.lab11.labwork7;

/**
 * Class Save has fields name, posx, posy, health ,artefacts.
 */
public class Save {
    private final String name;
    private final int posx;
    private final int posy;
    private final int health;
    private final int artefacts;

    /**
     * Instantiates a new Save.
     *
     * @param name      the name
     * @param posx      the posx
     * @param posy      the posy
     * @param health    the health
     * @param artefacts the artefacts
     */
    public Save(String name, int posx, int posy, int health, int artefacts) {
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.health = health;
        this.artefacts = artefacts;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets posx.
     *
     * @return the posx
     */
    public int getPosx() {
        return posx;
    }

    /**
     * Gets posy.
     *
     * @return the posy
     */
    public int getPosy() {
        return posy;
    }

    /**
     * Gets health.
     *
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets artefacts.
     *
     * @return the artefacts
     */
    public int getArtefacts() {
        return artefacts;
    }

}

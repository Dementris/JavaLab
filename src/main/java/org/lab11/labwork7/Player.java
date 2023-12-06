package org.lab11.labwork7;

/**
 * Class Player which create player
 */
public class Player {
    private String name;
    private int posx;
    private int posy;
    private int health;
    private int artifacts;

    /**
     * Instantiates a new Player.
     *
     * @param name      the name
     * @param posx      the posx
     * @param posy      the posy
     * @param health    the health
     * @param artefacts the artefacts
     */
    public Player(String name, int posx, int posy, int health, int artefacts) {
        this.name = name;
        this.posx = posx;
        this.posy = posy;
        this.health = health;
        this.artifacts = artefacts;
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
    public int getArtifacts() {
        return artifacts;
    }

    @Override
    public String toString() {
        if (health<=0){
            return "Player was dead";
        }else return "Player{" +
                "name='" + name + '\'' +
                ", position X=" + posx +
                ", position Y=" + posy +
                ", health=" + health +
                ", artefacts=" + artifacts +
                '}';
    }

    /**
     * Method getDamage() calculates the amount of damage received by a player.
     *
     * @param damage the damage
     */
    public void getDamage(int damage){
        System.out.println("Player gets damage...");
        if (damage>=health){
            health -=damage;
            artifacts = 0;
            System.out.println("You`re dead and lost all artifacts");
        }else health-=damage;
    }

    /**
     * Method losesArtifacts() create event when player loses all artifacts.
     */
    public void losesArtifacts(){
        System.out.println("The goblins have stolen your artifacts...");
        artifacts = 0;
    }

    /**
     * Method save() save current state.
     *
     * @return the save
     */
    public Save save(){
        return new Save(name,posx,posy,health, artifacts);
    }

    /**
     * Method load() load current state.
     *
     * @param save the save
     */
    public void load(Save save){
        name = save.getName();
        posx = save.getPosx();
        posy = save.getPosy();
        health = save.getHealth();
        artifacts = save.getArtefacts();

    }
}

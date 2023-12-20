package org.lab11.labwork9;

/**
 * Class GameWorld has fileds name, difficult, score
 * and player.
 */
public class GameWorld {
    /**
     * The Name.
     */
    String name;
    /**
     * The Dificult.
     */
    Dificult dificult;
    /**
     * The Score.
     */
    int score;
    /**
     * The Player.
     */
    Player player;


    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets dificult.
     *
     * @param dificult the dificult
     */
    public void setDificult(Dificult dificult) {
        this.dificult = dificult;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Add player.
     *
     * @param player the player
     */
    public void addPlayer(Player player){
        this.player = player;
    }

    @Override
    public String toString() {
        return "GameWorld{" +
                "name='" + name + '\'' +
                ", dificult=" + dificult +
                ", score=" + score +
                ", player=" + player +
                '}';
    }
}

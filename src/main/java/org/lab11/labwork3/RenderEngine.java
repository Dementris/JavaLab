package org.lab11.labwork3;

/**
 * General interface component.
 *
 */
public interface RenderEngine {
    /**
     * Method getposx() gets coordinates x.
     *
     * @return the x
     */
    public int getposX();

    /**
     * Method getposy() gets coordinates y.
     *
     * @return the y
     */
    public int getposY();

    /**
     * Method getColor() gets color.
     *
     * @return the color
     */
    public String getColor();

    /**
     * Method setColor() sets color.
     *
     * @param i the
     * @return the color
     */
    public String setColor(String i);

    /**
     * Method render() render element.
     */
    public void render();
}

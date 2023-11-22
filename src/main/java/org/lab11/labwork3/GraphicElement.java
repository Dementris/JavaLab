package org.lab11.labwork3;


/**
 * Concrete Component
 * Class GraphicElement implement RenderEngine
 * and has fields posx, posy, colorScheme.
 *
 */
public class GraphicElement implements RenderEngine{
    private int posx;
    private int posy;

    private String colorScheme;

    /**
     * Instantiates a new Graphic element.
     *
     * @param posx        the posx
     * @param posy        the posy
     * @param colorScheme the color scheme
     */
    public GraphicElement(int posx, int posy, String colorScheme) {
        this.posx = posx;
        this.posy = posy;
        this.colorScheme = colorScheme;
    }

    @Override
    public int getposX() {
        return this.posx;
    }

    @Override
    public int getposY() {
        return this.posy;
    }

    @Override
    public String getColor() {
        return this.colorScheme;
    }

    @Override
    public String setColor(String color) {
        return this.colorScheme = color;
    }
    @Override
    public void setPosx(int posx) {
        this.posx = posx;
    }
    @Override
    public void setPosy(int posy) {
        this.posy = posy;
    }

    @Override
    public void render() {
        System.out.printf("Method render() element in x:%s y:%s with color %s\n"
                ,getposX(),getposY(),getColor());
    }

}

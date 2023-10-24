package org.lab11.labwork3;

/**
 * Decorator to Class GraphicElement
 * implements interface RenderEngine.
 *
 */
public class ElementDecorator implements RenderEngine{
    /**
     * The Engine.
     */
    RenderEngine engine;

    /**
     * Instantiates a new Element decorator.
     *
     * @param engine the engine
     */
    public ElementDecorator(RenderEngine engine) {
        this.engine = engine;
    }

    @Override
    public int getposX() {
        return engine.getposX();
    }

    @Override
    public int getposY() {
        return engine.getposY();
    }

    @Override
    public String getColor() {
        return engine.getColor();
    }

    @Override
    public String setColor(String i) {
        return engine.setColor(i);
    }

    @Override
    public void render() {
        engine.render();
    }
}

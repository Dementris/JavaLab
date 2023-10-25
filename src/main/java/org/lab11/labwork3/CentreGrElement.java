package org.lab11.labwork3;

/**
 * Concrete Decorator
 * Class CentreGrElement extends ElementDecorator.
 *
 */
public class CentreGrElement extends ElementDecorator{
    /**
     * Instantiates a new Changed color el.
     *
     * @param engine the engine
     */
    public CentreGrElement(RenderEngine engine) {
        super(engine);
        center();
        render();
    }

    public void center() {
        engine.setPosy(0);
        engine.setPosx(0);
        System.out.println("Move element to centre");
    }

    @Override
    public void render() {
        super.render();

    }
}

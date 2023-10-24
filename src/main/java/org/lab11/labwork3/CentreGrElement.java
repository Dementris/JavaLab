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
    }

    @Override
    public void render() {
        System.out.println("Method render() to render element +  Move element to centre");
    }
}

package org.lab11.labwork3;

/**
 * Concrete Decorator
 * Class ChangedColorEl extends ElementDecorator.
 *
 */
public class ChangedColorEl extends ElementDecorator {

    /**
     * Instantiates a new Changed color el.
     *
     * @param engine the engine
     */
    public ChangedColorEl(RenderEngine engine) {
        super(engine);
    }

    /**
     * Change col string.
     *
     * @param color the color
     * @return the string
     */
    public String changeCol(String color){
        color = setColor(color);
        return color;
    }

    @Override
    public void render() {
        System.out.println("Method render() render element and change color to "
                +changeCol("#3673F"));
    }
}

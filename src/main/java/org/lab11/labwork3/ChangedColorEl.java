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
    String color;
    public ChangedColorEl(RenderEngine engine, String color) {
        super(engine);
        this.color = color;
        changeCol(color);
        render();
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
                +color);
    }
}

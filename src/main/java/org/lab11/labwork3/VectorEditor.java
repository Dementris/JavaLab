package org.lab11.labwork3;

/**
 * The Main class.
 */
public class VectorEditor {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        RenderEngine element1 = new GraphicElement(1,1,"#0000");
        element1.render();
        element1 = new CentreGrElement(element1);
        element1 = new ChangedColorEl(element1,"#2542");
    }
}

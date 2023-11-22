package org.lab11.labwork4;

import java.util.ArrayList;

/**
 * Class Directory icon
 * implements interface Directory
 * and has field name.
 */
public class DirectoryIcon  implements Directory{

    private String name;;
    private ArrayList<Icon> fileIconArrayList = new ArrayList<>();

    /**
     * Instantiates a new Directory icon.
     *
     * @param name the name
     */
    public DirectoryIcon(String name) {
        this.name = name;
    }



    @Override
    public void draw() {
        System.out.printf("Method draw() draw directory %s\n",name);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void addIcon(Icon icon) {
        fileIconArrayList.add(icon);
        System.out.println("Add icon "+icon.getName()+" to directory "+ name);
    }

    @Override
    public void printItems() {
        System.out.println("Draw elements in "+name+"directory [");
        for (Icon icon:fileIconArrayList){
            icon.draw();
        }
    }
}

package org.lab11.labwork4;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main Class
 */
public class GUI {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        List<Icon> icons = new ArrayList<>();
        List<Directory> directories = new ArrayList<>();

        directories.add(iconFactory.createDirectoryByName("First"));
        directories.add(iconFactory.createDirectoryByName("First"));
        directories.add(iconFactory.createDirectoryByName("Third"));

        icons.add(iconFactory.createIconByName("1"));
        icons.add(iconFactory.createIconByName("2"));

        for (Icon icon: icons){
            icon.draw();
        }
        for (Directory directory: directories){
            directory.draw();
        }
        for (Icon icon: icons){
            directories.get(0).addIcon(icon);
        }
        directories.get(0).printItems();
    }
}

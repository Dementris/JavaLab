package org.lab11.labwork4;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory
 * IconFactory create icons and directory.
 */
public class IconFactory {
    private static final Map<String, Icon> icons = new HashMap<>();
    private static final Map<String, Directory> directories = new HashMap<>();

    /**
     * Create icon by name icon.
     *
     * @param name the name
     * @return the icon
     */
    public Icon createIconByName(String name){
        Icon icon =  icons.get(name);
        if (icon == null) {
            icon = new FileIcon(name);
            System.out.println("Method createIconByName() create icon");
        }
        icons.put(name, icon);
        return icon;
    }

    /**
     * Create directory by name directory.
     *
     * @param name the name
     * @return the directory
     */
    public Directory createDirectoryByName(String name){
        Directory directory =  directories.get(name);

        if (directory == null) {
            directory= new DirectoryIcon(name);
            System.out.println("Create directory");
            }
        directories.put(name, directory);
        return directory;
    }

}

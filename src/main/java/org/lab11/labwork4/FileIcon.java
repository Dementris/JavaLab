package org.lab11.labwork4;

/**
 * Class File icon implements Icon
 * and has field name.
 */
public class FileIcon implements Icon{
    private String name;

    /**
     * Instantiates a new File icon.
     *
     * @param name the name
     */
    public FileIcon(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Draw file icons "+name);
    }

    public String getName() {
        return name;
    }
}

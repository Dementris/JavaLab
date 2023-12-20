package org.lab11.labwork8;


/**
 * Class File has fields name and extension.
 */
public class File {
    private final String name;
    private final String extension;


    /**
     * Instantiates a new File.
     *
     * @param name      the name
     * @param extension the extension
     */
    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;

    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets extension.
     *
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", extension='" + extension  +
                '}';
    }


}

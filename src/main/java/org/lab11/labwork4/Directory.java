package org.lab11.labwork4;

/**
 * The interface Directory
 * extend interface Icon.
 */
public interface Directory extends Icon{
    /**
     * Method addIcon() add icon to the directory.
     *
     * @param icon the icon
     */
    public void addIcon(Icon icon);

    /**
     * Method printItems() print items in the directory.
     */
    public void printItems();
}

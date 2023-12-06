package org.lab11.labwork7;

import java.util.HashMap;


/**
 * Class SaveFile has field saveHashMap
 */
public class SaveFile {
    private final HashMap<String,Save> saveHashMap = new HashMap<>();

    /**
     * Gets save.
     *
     * @param saveName the save name
     * @return the save
     */
    public Save getSave(String saveName) {
        System.out.println("Loading "+saveName+"...");
        return saveHashMap.get(saveName);
    }

    /**
     * Sets save.
     *
     * @param saveName the save name
     * @param save     the save
     */
    public void setSave(String saveName,Save save) {
        System.out.println("Saving current state as "+saveName);
        saveHashMap.put(saveName,save);
    }
}

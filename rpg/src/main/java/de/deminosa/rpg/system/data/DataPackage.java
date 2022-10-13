package de.deminosa.rpg.system.data;

import java.util.HashMap;

public class DataPackage {
    
    private final HashMap<String, DataContainer> dataPackage;

    public DataPackage() {
        this.dataPackage = new HashMap<String, DataContainer>();
    }

    public void put(String key, DataContainer container) {
        dataPackage.put(key, container);
    }

    public DataContainer getContainer(String key) {
        return dataPackage.get(key);
    }

}

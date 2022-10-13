package de.deminosa.rpg.system.data;

import java.util.HashMap;

public class DataContainer {
    
    private final HashMap<String, DataPackage> dataMap;

    public DataContainer() {
        this.dataMap = new HashMap<String, DataPackage>();
    }

    public void put(String key, DataPackage data) {
        dataMap.put(key, data);
    }

    public DataPackage getPackage(String key) {
        if (dataMap.get(key) == null) return new DataPackage();
        return dataMap.get(key);
    }

    @Override
    public String toString() {
        return "DataContainer [dataMap=" + dataMap + "]";
    }
    
}

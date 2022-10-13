package de.deminosa.rpg.system.data;

import java.util.HashMap;

public class DataPackage {
    private final HashMap<String, Data> dataMap;

    public DataPackage() {
        this.dataMap = new HashMap<String, Data>();
    }

    public void put(String key, Data data) {
        dataMap.put(key, data);
    }

    public Data getData(String key) {
        if (dataMap.get(key) == null) return new Data(key, null);
        return dataMap.get(key);
    }

    @Override
    public String toString() {
        return "DataPackage [dataMap=" + dataMap + "]";
    }
}

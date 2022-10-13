package de.deminosa.rpg.system.data;

import java.util.HashMap;

public class DataShip {
    private final HashMap<String, DataContainer> dataMap;

    public DataShip() {
        this.dataMap = new HashMap<String, DataContainer>();
    }

    public void put(String key, DataContainer data) {
        dataMap.put(key, data);
    }

    public DataContainer getContainer(String key) {
        if (dataMap.get(key) == null) return new DataContainer();
        return dataMap.get(key);
    }

    @Override
    public String toString() {
        return "DataShip [dataMap=" + dataMap + "]";
    }
}

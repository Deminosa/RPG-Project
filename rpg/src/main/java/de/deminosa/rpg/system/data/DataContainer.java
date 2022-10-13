package de.deminosa.rpg.system.data;

import java.util.HashMap;

public class DataContainer {
    private final HashMap<String, Data> container;

    public DataContainer() {
        this.container = new HashMap<String, Data>();
    }

    public void put(String key, Data data) {
        container.put(key, data);
    }

    public Data getData(String key) {
        return container.get(key);
    }
}

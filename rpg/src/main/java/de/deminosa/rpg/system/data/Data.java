package de.deminosa.rpg.system.data;
 
public class Data {
    
    private final String key;
    private final Object val;
    
    public Data(String key, Object val) {
        this.key = key; 
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public Object getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Data [key=" + key + ", val=" + val + "]";
    }

}

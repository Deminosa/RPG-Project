package de.deminosa.rpg.system.data;
 
public class Data {
    
    private Object val;
    
    public Data(Object val) {
        this.val = val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public int getInt() {
        return (Integer) val;
    }

    public String getString() {
        return (String) val;
    }

    public long getLong() {
        return (Long) val;
    }

    @Override
    public String toString() {
        return "Data [val=" + val + "]";
    }

}

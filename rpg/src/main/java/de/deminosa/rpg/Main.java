package de.deminosa.rpg;

import org.bukkit.plugin.java.JavaPlugin;

import de.deminosa.rpg.system.data.DataContainer;
import de.deminosa.rpg.system.data.DataShip;

public class Main extends JavaPlugin{
    
    private static Main instance;

    private DataShip ship;

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;

        ship = new DataShip();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public DataShip getShip() {
        return ship;
    }

    public static Main get() {
        return instance;
    }
}

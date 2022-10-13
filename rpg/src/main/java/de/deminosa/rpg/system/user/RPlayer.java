package de.deminosa.rpg.system.user;

import org.bukkit.entity.Player;

import de.deminosa.core.entitys.User;
import de.deminosa.rpg.Main;
import de.deminosa.rpg.system.data.Data;
import de.deminosa.rpg.system.data.DataContainer;
import de.deminosa.rpg.system.data.DataPackage;
import de.deminosa.rpg.system.data.DataShip;

public class RPlayer extends User{

    private final DataShip ship;
    private final DataContainer container;

    private final DataPackage stats, playerStats;

    public RPlayer(Player player) { 
        super(player);
        ship = Main.get().getShip();
        container = ship.getContainer(player.getUniqueId().toString());

        stats = container.getPackage("stats");
        playerStats = container.getPackage("playerstats");
    }
 
    private void setup() {
        changeValues(playerStats, "hp", 1);
        
    }
    
    private void changeValues(DataPackage package1, String key, Object val) {
        Data data = package1.getData(key);
        data.setVal(val);
        package1.put(key, data);
    }
}

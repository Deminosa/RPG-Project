package de.deminosa.rpg.system.user;

import org.bukkit.entity.Player;

import de.deminosa.core.entitys.User;
import de.deminosa.core.utils.files.YamlConfig;
import de.deminosa.rpg.Main;
import de.deminosa.rpg.system.data.Data;
import de.deminosa.rpg.system.data.DataContainer;
import de.deminosa.rpg.system.data.DataPackage;
import de.deminosa.rpg.system.data.DataShip;

public class RPlayer extends User{

    private final DataShip ship;
    private final DataContainer container;
    private final DataPackage playerChar;
    private final String playerCharName;

    private final Player player;

    public RPlayer(Player player, String playerChar) { 
        super(player);
        this.player = player;
        ship = Main.get().getShip();
        container = ship.getContainer(player.getUniqueId().toString());

        this.playerCharName = playerChar;
        this.playerChar = container.getPackage(playerChar);
    }
 
    private void setup() {
        int maxHp = 50;
        int currentHp = maxHp;
        long currentXp = 0l;
        long maxXp = 135l;
        int defense = 1;
        int maxDmg = 3;
        int minDmg = 1;

        playerChar.addData("maxHP", maxHp);
        playerChar.addData("currentHP", currentHp);
        playerChar.addData("currentXp", currentXp);
        playerChar.addData("maxXp", maxXp);
        playerChar.addData("defense", defense);
        playerChar.addData("maxDmg", maxDmg);
        playerChar.addData("minDmg", minDmg);
    }
    
    public void saveData() {
        YamlConfig config = new YamlConfig(Main.get(), player.getUniqueId().toString(), playerCharName);
        
        playerChar.getDataMap().keySet().forEach(s -> {
            config.set(s, playerChar.getData("playerChar."+s).getVal());
        });
        config.save();
    }
}

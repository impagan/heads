package me.pagan.heads;

import java.util.logging.Level;
import me.pagan.heads.enums.Heads;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Maicon (MrPagan)
 */
public class Main extends JavaPlugin {
    
    @Override
    public  void onEnable(){
        getLogger().log(Level.INFO, "Baixando cabeças...");
        
    }
    public static void main(String[] args) {
        System.out.println(Heads.values().length);
    }
    
}

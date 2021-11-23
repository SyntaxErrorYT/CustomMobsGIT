package me.syntaxerror.custommobsgit;

import me.syntaxerror.custommobsgit.MobEvents.LeapingSpider;
import me.syntaxerror.custommobsgit.MobEvents.Necromancer;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMobsGIT extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("leapingspider").setExecutor(new Commands());
        this.getCommand("necromancer").setExecutor(new Commands());

        this.getServer().getPluginManager().registerEvents(new LeapingSpider(this), this);
        this.getServer().getPluginManager().registerEvents(new Necromancer(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

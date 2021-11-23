package me.syntaxerror.custommobsgit;

import me.syntaxerror.custommobsgit.MobEvents.LeapingSpider;
import me.syntaxerror.custommobsgit.MobEvents.Necromancer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.isOp()){
                if(cmd.getName().equalsIgnoreCase("leapingspider")){
                    LeapingSpider.createLeapingSpider(player.getLocation());
                }
                if(cmd.getName().equalsIgnoreCase("necromancer")){
                    Necromancer.createNecromancer(player.getLocation());
                }
            }
            else{
                player.sendMessage("Only players can use this command!");
            }
        }
        else{
            sender.sendMessage("Only players can use this command!");
        }
        return true;
    }
}

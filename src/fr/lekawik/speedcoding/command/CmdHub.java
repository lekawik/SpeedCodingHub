package fr.lekawik.speedcoding.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdHub implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		Player p = (Player)s;
		if(label.equalsIgnoreCase("spawn")){
			if(s instanceof Player){
				p.sendMessage("§7vous aller être téléportez au spawn ...");
				p.teleport(Bukkit.getWorlds().get(0).getSpawnLocation());
			}
		}
		
		return false;
	}

}

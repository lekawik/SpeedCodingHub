package fr.lekawik.speedcoding;

import org.bukkit.plugin.java.JavaPlugin;

import fr.lekawik.speedcoding.command.CmdHub;

public class SpeedCoding extends JavaPlugin{
	
	public void onEnable() {
		getCommand("spawn").setExecutor(new CmdHub());
		
	}

}

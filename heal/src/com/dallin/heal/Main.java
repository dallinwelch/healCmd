package com.dallin.heal;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		System.out.println("HEAL PLUGIN ENABLED");
	}
	@Override
	public void onDisable() {
		System.out.println("HEAL PLUGIN DISBLED");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		if(cmd.getName().equals("heal")) {
			if(sender instanceof Player) {
			Player player = (Player) sender;
			
			player.sendMessage(ChatColor.GRAY + "Heal" + ChatColor.GREEN + player.getName() + ChatColor.GRAY + "Your health has been restored" );
			player.setHealth(20.0);
			}else {
				System.out.println("You cannot use this command through console!");
			}
			
		}
		return false;
	}
}

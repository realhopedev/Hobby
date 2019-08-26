package me.hopedev.LobbySystem.Commands;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.hopedev.LobbySystem.Main;
import me.hopedev.LobbySystem.Commands.listed.build;
import me.hopedev.LobbySystem.Commands.listed.main;

public class Hobby implements CommandExecutor {
	private Main plugin;

	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args){
		
		if (cmd.getName().equalsIgnoreCase("Hobby")) {
			 try {
				main.ex(sender, args);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return true;
			
		} else if (cmd.getName().equalsIgnoreCase("menu")) {
			main.gui(sender, args);
			return true;
		} else if (cmd.getName().equalsIgnoreCase("build")) {
			if (sender.hasPermission("hobby.build")) {
			build.build(sender, args);
			return true;
		} else if (!sender.hasPermission("hobby.build")) {
			sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-nopermission").replace("&", "§"));
			return true;
		}
		}
		return false;
	}

}

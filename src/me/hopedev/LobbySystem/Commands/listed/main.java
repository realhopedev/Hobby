package me.hopedev.LobbySystem.Commands.listed;

import java.io.IOException;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

import me.hopedev.LobbySystem.Main;
import me.hopedev.LobbySystem.Config.reload;
import me.hopedev.LobbySystem.GUI.GUI;


public class main {


	public static void ex(CommandSender sender, String[] args) throws IOException {
		
	
		if (args.length == 0) {
			sender.sendMessage(Main.lockprefix);
			sender.sendMessage("§9Developer: §bHopeDev (Discord: Hope#1445)");
			sender.sendMessage("§9Version: §b"+Main.inst().getDescription().getVersion());
			
		} else if (args.length > 0) {
			Player p = (Player) sender;
			if (sender.hasPermission("hobby.admin")) {
				if (args[0].equalsIgnoreCase("reload")) {
					reload.reloadConfig(sender);
				} else if (args[0].equalsIgnoreCase("tp")) {
					if (args.length == 2) {
					}
				} else if (args[0].equalsIgnoreCase("set")) {
					ChangeSettings.change(sender, args);
				} else {
					p.sendMessage(Main.lockprefix+"§cDieser Befehl existiert nicht");
					p.sendMessage(Main.lockprefix+"§cBenutzung: §e/hobby §7reload/tp/set");
					
				}
			} else if (!sender.hasPermission("hobby.admin")) {
				p.sendMessage(Main.lockprefix+"§cDazu hast du keine Rechte");
			}
}
	}

	public static void gui(CommandSender sender, String[] args) {
			GUI.open(sender, args);
		
	}
}



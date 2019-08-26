package me.hopedev.LobbySystem.Config;

import java.io.File;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.hopedev.LobbySystem.Main;

public class reload {

	public static void reloadConfig(CommandSender sender) {
		sender.sendMessage(Main.lockprefix+"§eKonfiguration wird neugeladen...");
			Main.loadConfig();
			sender.sendMessage(Main.lockprefix+"§eKonfiguration wurde neugeladen!");
	}
}
	





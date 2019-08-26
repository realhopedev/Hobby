package me.hopedev.LobbySystem.Commands.listed;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.hopedev.LobbySystem.Main;

public class build {

	public static void build(CommandSender sender, String[] args) {
		
		if (args.length == 0) {
			Player p = (Player) sender;
			if (Main.build.get(p) == null) {
			 Main.build.put(p, true);
			 p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-on").replace("&", "§"));
			} else if (Main.build.get(p) == false) {
				 Main.build.put(p, true);
				 p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-on").replace("&", "§"));
			}
			else if (Main.build.get(p) == true) {
			Main.build.put(p, false);
			p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-off").replace("&", "§"));
			}
			
		
		}
		if (args.length == 1) {
			 if (Bukkit.getPlayer(args[0]) == null) {
				 String not = args[0];
    			String message = Main.cfg3.getString("build-notonline").replaceAll("%player%", not);
 				sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§"));
 			
 		   } else if (Bukkit.getPlayer(args[0]) != null) {
 			   Player target = Bukkit.getPlayer(args[0]);
 			   
 			  if (Main.build.get(target) == null) {
 				 String targetname = target.getName();
 				 Main.build.put(target, true);
     			String message = Main.cfg3.getString("build-on-other").replaceAll("%player%", targetname);
 				 sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§"));
 				} else if (Main.build.get(target) == false) {
 					String targetname = target.getName();
 					 Main.build.put(target, true);
 					String message = Main.cfg3.getString("build-on-other").replaceAll("%player%", targetname);
 					 sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§"));
 					
 				}
 				else if (Main.build.get(target) == true) {
 				String targetname = target.getName();
 				Main.build.put(target, false);
 				String message = Main.cfg3.getString("build-off-other").replaceAll("%player%", targetname);
 				sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§"));
 				}
 			   
		}
		} else if (args.length >= 1) {
			sender.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" §cBenutzung: §7/build <Spieler>");
		}
		
	}

}

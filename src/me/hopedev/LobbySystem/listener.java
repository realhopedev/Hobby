package me.hopedev.LobbySystem;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.hopedev.LobbySystem.GUI.GUI;

public class listener implements Listener{

	@EventHandler
	public void onJoin (PlayerJoinEvent event) {
		
		Material item1 = Material.COMPASS;
        ItemStack ref1 = new ItemStack(item1);
        ItemMeta metaref1 = ref1.getItemMeta();
        metaref1.setDisplayName("§cMenu");
        ref1.setItemMeta(metaref1);
		event.getPlayer().getInventory().setItem(4, ref1);
    	String worldname = Main.cfg2.getString("spawn.world");
    	World world = Bukkit.getServer().getWorld(worldname);
        double x = Main.cfg2.getDouble("spawn.x");
        double y = Main.cfg2.getDouble("spawn.y");
        double z = Main.cfg2.getDouble("spawn.z");
        Location loc = new Location(world, x, y, z);
		event.getPlayer().teleport(loc);
	}
		
	
	@EventHandler
	public void ItemDrop (PlayerDropItemEvent event) {
		event.setCancelled(true);
	}
	@EventHandler
	public void inventoryclick(InventoryClickEvent event) {
		if (event.getSlot() == 4) {
			event.setCancelled(true);
			event.getWhoClicked().closeInventory();
		}
	}
	@EventHandler
	public void onItemClick (PlayerInteractEvent event) {
		if (event.getItem() == null ) {
			event.setCancelled(false);
			
		} else if (event.getItem().getType() == Material.COMPASS) {
		if (event.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cMenu")) {
			GUI.open(event.getPlayer(), null);
			event.setCancelled(false);
			
		} else {
			event.setCancelled(false);
		}
		}
		 else {
			event.setCancelled(false);
		}
	}
	@EventHandler
	public void onBlockPlace (BlockPlaceEvent event) {
	 Player eventplayer = event.getPlayer();
	 
	 if (Main.build.get(eventplayer) == null) {
		 event.setCancelled(true);
		 eventplayer.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-notallowed").replace("&", "§"));
	 } else if (Main.build.get(eventplayer) == false) {
		 event.setCancelled(true);
		 eventplayer.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-notallowed").replace("&", "§"));
		 
	 } else if (Main.build.get(eventplayer) == true) {
		 event.setCancelled(false);
	 }
	 
		
	}
	@EventHandler
	public void onBlockBreak (BlockBreakEvent event) {
		 Player eventplayer = event.getPlayer();
		 
		 if (Main.build.get(eventplayer) == null) {
			 event.setCancelled(true);
			 eventplayer.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-notallowed").replace("&", "§"));
		 } else if (Main.build.get(eventplayer) == false) {
			 event.setCancelled(true);
			 eventplayer.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("build-notallowed").replace("&", "§"));
			 
		 } else if (Main.build.get(eventplayer) == true) {
			 event.setCancelled(false);
		 }
	}
	
	@EventHandler
	public void onPlayerJoin (PlayerJoinEvent event) {
		if (Main.cfg2.getBoolean("join-leave-message") == true) {
			String joined = event.getPlayer().getName();
		String message = Main.cfg3.getString("join-message").replaceAll("%player%", joined);
			event.setJoinMessage(message.replace("&", "§"));
		} else if (Main.cfg2.getBoolean("join-leave-message") == false) {
			event.setJoinMessage("");
		}
	}
	
	@EventHandler
	public void onPlayerLeave (PlayerQuitEvent event) {
		if (Main.cfg2.getBoolean("join-leave-message") == true) {
			String left = event.getPlayer().getName();
		String message = Main.cfg3.getString("leave-message").replaceAll("%player%", left);
			event.setQuitMessage(message.replace("&", "§"));
			
		} else if (Main.cfg2.getBoolean("join-leave-message") == false) {
			event.setQuitMessage("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

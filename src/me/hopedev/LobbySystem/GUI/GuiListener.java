package me.hopedev.LobbySystem.GUI;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.dytanic.cloudnet.CloudNet;
import de.dytanic.cloudnet.driver.CloudNetDriver;
import de.dytanic.cloudnet.ext.bridge.node.CloudNetBridgeModule;
import me.hopedev.LobbySystem.Main;


public class GuiListener implements Listener {
	

	@EventHandler
    private void inventoryClick(InventoryClickEvent e)
    {
  
        Player p = (Player) e.getWhoClicked();
      
         if (e.getInventory().getTitle().equalsIgnoreCase(Main.cfg2.getString("menu-name").replace("&", "§")))
          {
             e.setCancelled(true);
             if ((e.getCurrentItem() == null) || (e.getCurrentItem().getType().equals(Material.AIR))) {
                 return;
             }
             UUID whoclicked = e.getWhoClicked().getUniqueId();
                if(e.getSlot() == 11){              
                	
                	
                    String servername = Main.cfg2.getString("servers.1");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.1"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                }
                 if(e.getSlot() == 15){              
                    String servername = Main.cfg2.getString("servers.2");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.2"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                }
                if(e.getSlot() == 19){              
                    String servername = Main.cfg2.getString("servers.3");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.3"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                }
                if(e.getSlot() == 22){            
                	String worldname = Main.cfg2.getString("spawn.world");
                	World world = Bukkit.getServer().getWorld(worldname);
                   double x = Main.cfg2.getDouble("spawn.x");
                   double y = Main.cfg2.getDouble("spawn.y");
                   double z = Main.cfg2.getDouble("spawn.z");
                   Location loc = new Location(world, x, y, z);
                   p.teleport(loc);
                   p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+Main.cfg3.getString("spawn-message").replace("&", "§")+"");
                }
                if(e.getSlot() == 25){              
                    String servername = Main.cfg2.getString("servers.5");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.5"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                    
                }
                if(e.getSlot() == 29){              
                    String servername = Main.cfg2.getString("servers.6");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.6"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                }
                if(e.getSlot() == 33){              
                    String servername = Main.cfg2.getString("servers.7");
                    CloudNetDriver.getInstance().sendCommandLine("players player "+e.getWhoClicked().getName()+" send "+Main.cfg2.getString("servers.7"));
            		String message = Main.cfg3.getString("serverswitch").replaceAll("%server%", servername);
            		
            		p.sendMessage(Main.cfg2.getString("prefix").replace("&", "§")+" "+message.replace("&", "§")+"");
                }

}
    }
}

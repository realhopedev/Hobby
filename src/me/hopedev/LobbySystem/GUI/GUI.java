package me.hopedev.LobbySystem.GUI;

import java.awt.List;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.hopedev.LobbySystem.Main;

public class GUI {

	public static void open(CommandSender sender, String[] args) {
		// Here we create our named help "inventory"
		Player p = (Player) sender;
        Inventory help = Bukkit.getServer().createInventory(p, 45, Main.cfg2.getString("menu-name").replace("&", "§"));

 //Here you define our item
        Material item1 = Material.valueOf(Main.cfg4.getString("1.item"));
        Material item2 = Material.valueOf(Main.cfg4.getString("2.item"));
        Material item3 = Material.valueOf(Main.cfg4.getString("3.item"));
        Material item4 = Material.valueOf(Main.cfg4.getString("4.item"));
        Material item5 = Material.valueOf(Main.cfg4.getString("5.item"));
        Material item6 = Material.valueOf(Main.cfg4.getString("6.item"));
        Material item7 = Material.valueOf(Main.cfg4.getString("7.item"));
        java.util.List<String> list1 = Main.cfg4.getStringList("1.lore");
        java.util.List<String> list2 = Main.cfg4.getStringList("2.lore");
        java.util.List<String> list3 = Main.cfg4.getStringList("3.lore");
        java.util.List<String> list4 = Main.cfg4.getStringList("4.lore");
        java.util.List<String> list5 = Main.cfg4.getStringList("5.lore");
        java.util.List<String> list6 = Main.cfg4.getStringList("6.lore");
        java.util.List<String> list7 = Main.cfg4.getStringList("7.lore");

        
            ItemStack ref1 = new ItemStack(item1);
            ItemMeta metaref1 = ref1.getItemMeta();
            ArrayList<String> lore= new ArrayList<String>();

            
            for (String string : list1){
                lore.add(string.replace("&", "§"));
            }

            metaref1.setLore(lore);
            metaref1.setDisplayName(Main.cfg4.getString("1.displayname").replace("&", "§"));
    

            ref1.setItemMeta(metaref1);
            
        
            ItemStack ref2 = new ItemStack(item2);
            ItemMeta metaref2 = ref2.getItemMeta();
            ArrayList<String> lore2= new ArrayList<String>();
            
            for (String string : list2){
                lore2.add(string.replace("&", "§"));
            }

            
            metaref2.setLore(lore2);
            metaref2.setDisplayName(Main.cfg4.getString("2.displayname").replace("&", "§"));
    

            ref2.setItemMeta(metaref2);
            
          
            ItemStack ref3 = new ItemStack(item3);
            ItemMeta metaref3 = ref3.getItemMeta();
            ArrayList<String> lore3= new ArrayList<String>();
            
            for (String string : list3){
                lore3.add(string.replace("&", "§"));
            }

            
            metaref3.setLore(lore3);
            metaref3.setDisplayName(Main.cfg4.getString("3.displayname").replace("&", "§"));
    

            ref3.setItemMeta(metaref3);
            
            
            ItemStack ref4 = new ItemStack(item4);
            ItemMeta metaref4 = ref4.getItemMeta();
            ArrayList<String> lore4= new ArrayList<String>();
            
            for (String string : list4){
                lore4.add(string.replace("&", "§"));
            }
            
            metaref4.setLore(lore4);
            metaref4.setDisplayName(Main.cfg4.getString("4.displayname").replace("&", "§"));
    

            ref4.setItemMeta(metaref4);
            
            
            ItemStack ref5 = new ItemStack(item5);
            ItemMeta metaref5 = ref5.getItemMeta();
            ArrayList<String> lore5= new ArrayList<String>();
            
            for (String string : list5){
                lore5.add(string.replace("&", "§"));
            }

            
            metaref5.setLore(lore5);
            metaref5.setDisplayName(Main.cfg4.getString("5.displayname").replace("&", "§"));
    

            ref5.setItemMeta(metaref5);
            
            ItemStack ref6 = new ItemStack(item6);
            ItemMeta metaref6 = ref6.getItemMeta();
            ArrayList<String> lore6= new ArrayList<String>();
            
            for (String string : list6){
                lore6.add(string.replace("&", "§"));
            }

            
            metaref6.setLore(lore6);
            metaref6.setDisplayName(Main.cfg4.getString("6.displayname").replace("&", "§"));
    

            ref6.setItemMeta(metaref6);
            

        
            ItemStack ref7 = new ItemStack(item7);
            ItemMeta metaref7 = ref7.getItemMeta();
            ArrayList<String> lore7= new ArrayList<String>();
            
            for (String string : list7){
 
                lore7.add(string.replace("&", "§"));
            }

            
            metaref7.setLore(lore7);
            metaref7.setDisplayName(Main.cfg4.getString("7.displayname").replace("&", "§"));
    

            ref7.setItemMeta(metaref7);
            
            ItemStack ref8 = new ItemStack(Material.STAINED_GLASS_PANE);
            ItemMeta metaref8 = ref8.getItemMeta();
            ref8.setDurability((short) 15);
            
            metaref8.setDisplayName(" ");
    

            ref8.setItemMeta(metaref8);
            help.setItem(11, ref1);
            help.setItem(15, ref2);
            help.setItem(19, ref3);
            help.setItem(22, ref4);
            help.setItem(25, ref5);
            help.setItem(29, ref6);
            help.setItem(33, ref7);
            help.setItem(0, ref8);
            help.setItem(1, ref8);
            help.setItem(2, ref8);
            help.setItem(3, ref8);
            help.setItem(4, ref8);
            help.setItem(5, ref8);
            help.setItem(6, ref8);
            help.setItem(7, ref8);
            help.setItem(8, ref8);
            help.setItem(9, ref8);
            help.setItem(10, ref8);
            help.setItem(12, ref8);
            help.setItem(13, ref8);
            help.setItem(14, ref8);
            help.setItem(16, ref8);
            help.setItem(17, ref8);
            help.setItem(18, ref8);
            help.setItem(20, ref8);
            help.setItem(21, ref8);
            help.setItem(23, ref8);
            help.setItem(24, ref8);
            help.setItem(26, ref8);
            help.setItem(27, ref8);
            help.setItem(28, ref8);
            help.setItem(30, ref8);
            help.setItem(31, ref8);
            help.setItem(32, ref8);
            help.setItem(34, ref8);
            help.setItem(35, ref8);
            help.setItem(36, ref8);
            help.setItem(37, ref8);
            help.setItem(38, ref8);
            help.setItem(39, ref8);
            help.setItem(40, ref8);
            help.setItem(41, ref8);
            help.setItem(42, ref8);
            help.setItem(43, ref8);
            help.setItem(44, ref8);
 
 
            
            
        //Here opens the inventory
        p.openInventory(help);
        p.playSound(p.getLocation(), Sound.ORB_PICKUP, 3L, 2L);
		
	}

	
}

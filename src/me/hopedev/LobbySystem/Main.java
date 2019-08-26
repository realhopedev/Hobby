package me.hopedev.LobbySystem;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import me.hopedev.LobbySystem.Commands.Hobby;
import me.hopedev.LobbySystem.Config.configfile;
import me.hopedev.LobbySystem.GUI.GuiListener;


public class Main extends JavaPlugin implements PluginMessageListener{
	public static ByteArrayOutputStream b = new ByteArrayOutputStream();
	public static DataOutputStream out = new DataOutputStream(b);
   public static File file2 = new File("plugins/HopeLobby", "config.yml");
   public static File file3 = new File("plugins/HopeLobby", "messages.yml");
   public static File file4 = new File("plugins/HopeLobby", "items.yml");
   public static FileConfiguration cfg2 = YamlConfiguration.loadConfiguration(file2);
   public static FileConfiguration cfg3 = YamlConfiguration.loadConfiguration(file3);
   public static FileConfiguration cfg4 = YamlConfiguration.loadConfiguration(file4);
	private static Main instance;
    public static File customConfigFile;
    public static HashMap<Player, Boolean> build = new HashMap<>();
    public static FileConfiguration customConfig;
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	public static String lockprefix = "§e§lH§r§6obby§7»§f ";
	@Override
	public void onEnable() {
		createCustomConfig("messages.yml");
		createCustomConfig("config.yml");
		createCustomConfig("items.yml");
		loadConfig(); 
		Bukkit.getServer().getPluginManager().registerEvents(new listener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new GuiListener(), this);
	    this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	    this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
		instance = this;

		this.getCommand("hobby").setExecutor(new Hobby());
		this.getCommand("menu").setExecutor(new Hobby());
		this.getCommand("build").setExecutor(new Hobby());
		console.sendMessage(lockprefix+"§e§lHopes §r§6Lobbysystem §awird gestartet!");
		loadConfig();
		

	}
	@Override
	public void onDisable() {
		console.sendMessage(lockprefix+"§e§lHopes §r§6Lobbysystem §awird deaktiviert!");
		
	}
	public static Main inst() {
		  return instance;
		}
	
	private void createCustomConfig(String name) {
	    customConfigFile = new File(getDataFolder(), name);
	    if (!customConfigFile.exists()) {
	        customConfigFile.getParentFile().mkdirs();
	        saveResource(name, false);
	        
	     }

	    customConfig= new YamlConfiguration();
	    try {
	        customConfig.load(customConfigFile);
	    } catch (IOException | InvalidConfigurationException e) {
	        e.printStackTrace();
	    }
	}
    public static void loadConfig() {
    	cfg2 = YamlConfiguration.loadConfiguration(file2);
    	cfg3 = YamlConfiguration.loadConfiguration(file3);
    	cfg4 = YamlConfiguration.loadConfiguration(file4);
    }
    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
      if (!channel.equals("BungeeCord")) {
        return;
      }
      ByteArrayDataInput in = ByteStreams.newDataInput(message);
      String subchannel = in.readUTF();
      if (subchannel.equals("SomeSubChannel")) {
        // Use the code sample in the 'Response' sections below to read
        // the data.
      }
    }


}

package de.teddy.advancementhunt.util;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class LocationUtil {

    private File file = new File("plugins//AdvancementHunt//locations.yml");
    private YamlConfiguration locations = YamlConfiguration.loadConfiguration(file);
	
	String root = "AdvancementHunt.";
    
	public void setLobbySpawn(Player player) {
		locations.set(root + "LobbySpawn.World", player.getLocation().getWorld().getName());
		locations.set(root + "LobbySpawn.X", player.getLocation().getX());
		locations.set(root + "LobbySpawn.Y", player.getLocation().getY());
		locations.set(root + "LobbySpawn.Z", player.getLocation().getZ());
		locations.set(root + "LobbySpawn.Pitch", player.getLocation().getPitch());
		locations.set(root + "LobbySpawn.Yaw", player.getLocation().getYaw());
		
		try {
			locations.save(this.file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void teleport(Player player, String name) {
		World world = Bukkit.getWorld(locations.getString(root + name + ".World"));
		double x = (double) locations.getDouble(root + name + ".X");
		double y = (double) locations.getDouble(root + name + ".Y");
		double z = (double) locations.getDouble(root + name + ".Z");
		float yaw = (float) locations.getDouble(root + name + ".Yaw");
		float pitch = (float) locations.getDouble(root + name + ".Pitch");
		
		Location location = new Location(world, x, y, z, yaw, pitch);
		
		player.teleport(location);
	}
	
}

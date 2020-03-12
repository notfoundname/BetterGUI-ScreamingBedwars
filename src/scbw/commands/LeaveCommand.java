package scbw.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class LeaveCommand extends Command {

	public LeaveCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
    taskChain.sync(() -> leaveGame(player));
	}
	
	public void leaveGame(Player p) {
		if (Main.isPlayerInGame(p)) {
            Main.getPlayerGameProfile(p).changeGame(null);
        } else {
            p.sendMessage(ChatColor.RED + "You are not playing any game!");
        }
	}
}

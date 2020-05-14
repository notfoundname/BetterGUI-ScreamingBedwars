package scbw.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class JoinCommand extends Command {

	public JoinCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		String parsed = getParsedCommand(player);
		taskChain.sync(() -> joinGame(player, parsed));
	}
	
	public void joinGame(Player p, String gameName)
	{
		if (Main.isPlayerInGame(p)){
            p.sendMessage(ChatColor.RED + "You are already in game!");
            return;
        }
        if (Main.isGameExists(gameName)){
        	Main.getGame(gameName).joinToGame(p);
        	return;
        } else {
            p.sendMessage(ChatColor.RED + "Game does not exist!");
            return;
        }
    }
}


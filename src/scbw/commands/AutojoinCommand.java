package scbw.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.api.game.Game;
import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class AutojoinCommand extends Command{

	public AutojoinCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		taskChain.sync(() -> autoJoin(player));
		
	}
	public void autoJoin(Player player) {
		if (Main.isPlayerInGame(player)) {
            player.sendMessage(ChatColor.RED + "You are already playing a game!");
            return;
        }
		
        Game game = Main.getInstance().getFirstWaitingGame();
        
        if (game == null) {
            player.sendMessage(ChatColor.RED + "There are no empty games.");
            return;
        } else {
            game.joinToGame(player);
        }
	}

}

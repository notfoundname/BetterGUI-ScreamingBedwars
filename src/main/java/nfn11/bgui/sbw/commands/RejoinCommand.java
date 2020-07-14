package nfn11.bgui.sbw.commands;

import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;

import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;
import static org.screamingsandals.bedwars.lib.lang.I18n.i18n;

public class RejoinCommand extends Command {

	public RejoinCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		taskChain.async(() -> {
			if (Main.isPlayerInGame(player)) {
				player.sendMessage(i18n("you_are_already_in_some_game"));
				return;
			}
			String name = null;
			if (Main.isPlayerGameProfileRegistered(player)) {
				name = Main.getPlayerGameProfile(player).getLatestGameName();
			}
			if (name == null) {
				player.sendMessage(i18n("you_are_not_in_game_yet"));
				return;
			}
			if (Main.isGameExists(name)) {
				Main.getGame(name).joinToGame(player);
			} else {
				player.sendMessage(i18n("game_is_gone"));
			}
		});
	}
}

package nfn11.bgui.sbw.commands;

import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.lib.lang.I18n;

import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class AutojoinCommand extends Command {
	public AutojoinCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		taskChain.async(() -> {
			if (Main.isPlayerInGame(player)) {
				player.sendMessage(I18n.i18nonly("prefix") + " " + I18n.i18n("you_are_already_in_some_game"));
				return;
			}
			Game game = Main.getInstance().getFirstWaitingGame();
			if (game == null) {
				player.sendMessage(I18n.i18nonly("prefix") + " " + I18n.i18n("there_is_no_empty_game"));
				return;
			}
			game.joinToGame(player);
		});
	}
}

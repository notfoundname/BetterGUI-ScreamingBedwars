package nfn11.bgui.sbw.commands;

import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.lib.lang.I18n;

import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class LeaveCommand extends Command {
	public LeaveCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		taskChain.sync(() -> {
			if (Main.isPlayerInGame(player)) {
				Main.getPlayerGameProfile(player).changeGame(null);
			} else {
				player.sendMessage(I18n.i18nonly("prefix") + " " + I18n.i18n("you_are_not_in_game_yet"));
				return;
			}
		});
	}
}

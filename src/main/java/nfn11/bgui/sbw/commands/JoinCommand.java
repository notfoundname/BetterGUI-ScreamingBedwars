package nfn11.bgui.sbw.commands;

import org.bukkit.entity.Player;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.lib.lang.I18n;
import me.hsgamer.bettergui.lib.taskchain.TaskChain;
import me.hsgamer.bettergui.object.Command;

public class JoinCommand extends Command {
	
	public JoinCommand(String string) {
		super(string);
	}

	@Override
	public void addToTaskChain(Player player, TaskChain<?> taskChain) {
		String parsed = getParsedCommand(player);
		taskChain.async(() -> {
			if (Main.isPlayerInGame(player)) {
				player.sendMessage(I18n.i18nonly("prefix") + " " + I18n.i18n("you_are_already_in_some_game"));
				return;
			}
			Main.getGame(parsed).joinToGame(player);
		});
	}
}

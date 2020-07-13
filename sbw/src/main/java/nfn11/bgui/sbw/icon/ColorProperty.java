package nfn11.bgui.sbw.icon;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.api.TeamColor;
import me.hsgamer.bettergui.object.Icon;
import me.hsgamer.bettergui.object.property.item.ItemProperty;

public class ColorProperty extends ItemProperty<Boolean, Boolean> {

	public ColorProperty(Icon icon) {
		super(icon);
	}

	@Override
	public boolean compareWithItemStack(Player p, ItemStack is) {
		return false;
	}

	@Override
	public Boolean getParsed(Player p) {
		return getValue();
	}

	@Override
	public ItemStack parse(Player player, ItemStack is) {
		if (!Main.isPlayerInGame(player) || Main.getPlayerGameProfile(player).isSpectator)
			return is;

		if (getParsed(player).equals(Boolean.TRUE)) {
			TeamColor color = Main.getPlayerGameProfile(player).getGame().getTeamOfPlayer(player).getColor();
			Main.applyColor(color, is); //lol i didnt know i can just use this
		}
		return is;
	}

}

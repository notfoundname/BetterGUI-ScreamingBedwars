package scbw.icon;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.screamingsandals.bedwars.Main;
import org.screamingsandals.bedwars.api.BedwarsAPI;
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

	@SuppressWarnings("deprecation")
	@Override
	public ItemStack parse(Player p, ItemStack is) {
		
		if(!BedwarsAPI.getInstance().isPlayerPlayingAnyGame(p)) return is;
		if(Main.getPlayerGameProfile(p).isSpectator) return is;
		
		TeamColor color = BedwarsAPI.getInstance().getGameOfPlayer(p).getTeamOfPlayer(p).getColor();
		
		if(getParsed(p).equals(Boolean.TRUE)) {	
			
			if (is.getType().toString().contains("LEATHER_")) {
				LeatherArmorMeta meta = (LeatherArmorMeta) is.getItemMeta();
				switch (color) {
					case BLACK:
						meta.setColor(Color.fromRGB(0, 0, 0));
						break;
					case BLUE:
						meta.setColor(Color.fromRGB(0, 0, 170));
						break;
					case BROWN:
						meta.setColor(Color.fromRGB(139, 69, 19));
						break;
					case CYAN:
						meta.setColor(Color.fromRGB(85, 255, 255));
						break;
					case GRAY:
						meta.setColor(Color.fromRGB(85, 85, 85));
						break;
					case GREEN:
						meta.setColor(Color.fromRGB(0, 170, 0));
						break;
					case LIGHT_BLUE:
						meta.setColor(Color.fromRGB(85, 85, 255));
						break;
					case LIGHT_GRAY:
						meta.setColor(Color.fromRGB(170, 170, 170));
						break;
					case LIME:
						meta.setColor(Color.fromRGB(85, 255, 85));
						break;
					case MAGENTA:
						meta.setColor(Color.fromRGB(170, 0, 170));
						break;
					case ORANGE:
						meta.setColor(Color.fromRGB(255, 170, 0));
						break;
					case PINK:
						meta.setColor(Color.fromRGB(255, 85, 255));
						break;
					case RED:
						meta.setColor(Color.fromRGB(255, 85, 85));
						break;
					case WHITE:
						meta.setColor(Color.fromRGB(255, 255, 255));
						break;
					case YELLOW:
						meta.setColor(Color.fromRGB(255, 255, 85));
						break;
					default:
						break;
					}
				is.setItemMeta(meta);
			}
			
			if (is.getType().toString().contains("_WOOL")) {
				is.setType(Material.valueOf(color.toString() + "_WOOL"));
			}
			
			if (is.getType().toString().contains("_TERRACOTTA") && !is.getType().toString().contains("GLAZED")) {
				is.setType(Material.valueOf(color.toString() + "_TERRACOTTA"));
			}
			
			if (is.getType().toString().contains("_GLAZED_TERRACOTTA")) {
				is.setType(Material.valueOf(color.toString() + "_GLAZED_TERRACOTTA"));
			}
			
			if (is.getType().toString().contains("_DYE")) {
				is.setType(Material.valueOf(color.toString() + "_DYE"));
			}
			
			if (is.getType().toString().contains("_STAINED_GLASS") && !is.getType().toString().contains("_STAINED_GLASS_PANE")) {
				is.setType(Material.valueOf(color.toString() + "_STAINED_GLASS"));
			}
			
			if (is.getType().toString().contains("_STAINED_GLASS_PANE")) {
				is.setType(Material.valueOf(color.toString() + "_STAINED_GLASS_PANE"));
			}
			
			if (is.getType().toString().contains("_CARPET")) {
				is.setType(Material.valueOf(color.toString() + "_CARPET"));
			}
			
			if (is.getType().toString().contains("_BANNER")) {
				is.setType(Material.valueOf(color.toString() + "_BANNER"));
			}
			
			/* deprecated, for 1.8 - 1.12 */
			if (is.getType().toString().equals("WOOL")
					|| is.getType().toString().equals("STAINED_CLAY")
					|| is.getType().toString().equals("CONCRETE")
					|| is.getType().toString().equals("CONCRETE_POWDER")
					|| is.getType().toString().equals("STAINED_GLASS")
					|| is.getType().toString().equals("STAINED_GLASS_PANE")
					|| is.getType().toString().equals("CARPET")
					|| is.getType().toString().equals("INK_SACK")
					|| is.getType().toString().equals("BANNER")) {
				switch (color) {
					case BLACK:
						is.setDurability((short) 15);
						break;
					case BLUE:
						is.setDurability((short) 11);
						break;
					case BROWN:
						is.setDurability((short) 12);
						break;
					case CYAN:
						is.setDurability((short) 9);
						break;
					case GRAY:
						is.setDurability((short) 7);
						break;
					case GREEN:
						is.setDurability((short) 13);
						break;
					case LIGHT_BLUE:
						is.setDurability((short) 3);
						break;
					case LIGHT_GRAY:
						is.setDurability((short) 8);
						break;
					case LIME:
						is.setDurability((short) 5);
						break;
					case MAGENTA:
						is.setDurability((short) 2);
						break;
					case ORANGE:
						is.setDurability((short) 1);
						break;
					case PINK:
						is.setDurability((short) 6);
						break;
					case RED:
						is.setDurability((short) 14);
						break;
					case WHITE:
						break;
					case YELLOW:
						is.setDurability((short) 4);
						break;
					default:
						break;
				}
			}
		}
		return is;
	}
}

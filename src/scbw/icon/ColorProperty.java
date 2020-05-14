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
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_WOOL"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_WOOL"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_WOOL"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_WOOL"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_WOOL"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_WOOL"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_BLUE_WOOL"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_WOOL"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_WOOL"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_WOOL"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_WOOL"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_WOOL"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_WOOL"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_WOOL"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_WOOL"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_TERRACOTTA") && !is.getType().toString().contains("GLAZED")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_TERRACOTTA"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_TERRACOTTA"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_TERRACOTTA"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_TERRACOTTA"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_TERRACOTTA"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_TERRACOTTA"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_BLUE_TERRACOTTA"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_TERRACOTTA"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_TERRACOTTA"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_TERRACOTTA"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_TERRACOTTA"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_TERRACOTTA"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_TERRACOTTA"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_TERRACOTTA"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_TERRACOTTA"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_GLAZED_TERRACOTTA")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_GLAZED_TERRACOTTA"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_GLAZED_TERRACOTTA"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_GLAZED_TERRACOTTA"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_GLAZED_TERRACOTTA"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_GLAZED_TERRACOTTA"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_GLAZED_TERRACOTTA"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_BLUE_GLAZED_TERRACOTTA"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_GLAZED_TERRACOTTA"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_GLAZED_TERRACOTTA"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_GLAZED_TERRACOTTA"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_GLAZED_TERRACOTTA"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_GLAZED_TERRACOTTA"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_GLAZED_TERRACOTTA"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_GLAZED_TERRACOTTA"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_GLAZED_TERRACOTTA"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_DYE")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_DYE"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_DYE"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_DYE"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_DYE"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_DYE"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_DYE"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_DYE"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_DYE"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_DYE"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_DYE"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_DYE"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_DYE"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_DYE"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_DYE"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_DYE"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_STAINED_GLASS") && !is.getType().toString().contains("_STAINED_GLASS_PANE")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_STAINED_GLASS"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_STAINED_GLASS"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_STAINED_GLASS"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_STAINED_GLASS"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_STAINED_GLASS"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_STAINED_GLASS"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_STAINED_GLASS"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_STAINED_GLASS"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_STAINED_GLASS"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_STAINED_GLASS"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_STAINED_GLASS"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_STAINED_GLASS"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_STAINED_GLASS"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_STAINED_GLASS"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_STAINED_GLASS"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_STAINED_GLASS_PANE")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_STAINED_GLASS_PANE"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_STAINED_GLASS_PANE"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_STAINED_GLASS_PANE"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_STAINED_GLASS_PANE"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_STAINED_GLASS_PANE"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_STAINED_GLASS_PANE"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_STAINED_GLASS_PANE"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_STAINED_GLASS_PANE"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_STAINED_GLASS_PANE"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_STAINED_GLASS_PANE"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_STAINED_GLASS_PANE"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_STAINED_GLASS_PANE"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_STAINED_GLASS_PANE"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_STAINED_GLASS_PANE"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_STAINED_GLASS_PANE"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_CARPET")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_CARPET"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_CARPET"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_CARPET"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_CARPET"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_CARPET"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_CARPET"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_BLUE_CARPET"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_CARPET"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_CARPET"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_CARPET"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_CARPET"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_CARPET"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_CARPET"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_CARPET"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_CARPET"));
						break;
					default:
						break;
				}
			}
			
			if (is.getType().toString().contains("_BANNER")) {
				switch (color) {
					case BLACK:
						is.setType(Material.valueOf("BLACK_BANNER"));
						break;
					case BLUE:
						is.setType(Material.valueOf("BLUE_BANNER"));
						break;
					case BROWN:
						is.setType(Material.valueOf("BROWN_BANNER"));
						break;
					case CYAN:
						is.setType(Material.valueOf("CYAN_BANNER"));
						break;
					case GRAY:
						is.setType(Material.valueOf("GRAY_BANNER"));
						break;
					case GREEN:
						is.setType(Material.valueOf("GREEN_BANNER"));
						break;
					case LIGHT_BLUE:
						is.setType(Material.valueOf("LIGHT_BLUE_BANNER"));
						break;
					case LIGHT_GRAY:
						is.setType(Material.valueOf("LIGHT_GRAY_BANNER"));
						break;
					case LIME:
						is.setType(Material.valueOf("LIME_BANNER"));
						break;
					case MAGENTA:
						is.setType(Material.valueOf("MAGENTA_BANNER"));
						break;
					case ORANGE:
						is.setType(Material.valueOf("ORANGE_BANNER"));
						break;
					case PINK:
						is.setType(Material.valueOf("PINK_BANNER"));
						break;
					case RED:
						is.setType(Material.valueOf("RED_BANNER"));
						break;
					case WHITE:
						is.setType(Material.valueOf("WHITE_BANNER"));
						break;
					case YELLOW:
						is.setType(Material.valueOf("YELLOW_BANNER"));
						break;
					default:
						break;
				}
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

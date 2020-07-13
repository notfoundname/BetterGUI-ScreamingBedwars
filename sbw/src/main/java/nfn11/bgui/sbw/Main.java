package nfn11.bgui.sbw;

import me.hsgamer.bettergui.builder.CommandBuilder;
import me.hsgamer.bettergui.builder.PropertyBuilder;
import me.hsgamer.bettergui.object.addon.Addon;
import nfn11.bgui.sbw.commands.AutojoinCommand;
import nfn11.bgui.sbw.commands.JoinCommand;
import nfn11.bgui.sbw.commands.LeaveCommand;
import nfn11.bgui.sbw.icon.ColorProperty;

public class Main extends Addon {
	@Override
	public void onEnable() {
		CommandBuilder.register("bedwars-leave", LeaveCommand.class);
		CommandBuilder.register("bedwars-join:", JoinCommand.class);
		CommandBuilder.register("bedwars-auto-join", AutojoinCommand.class);
		PropertyBuilder.registerItemProperty("bedwars-apply-color-by-team", ColorProperty.class);
	}
}
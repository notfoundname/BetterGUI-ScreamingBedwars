package nfn11.bgui.sbw;

import me.hsgamer.bettergui.builder.CommandBuilder;
import me.hsgamer.bettergui.builder.PropertyBuilder;
import me.hsgamer.bettergui.object.addon.Addon;
import nfn11.bgui.sbw.commands.AutojoinCommand;
import nfn11.bgui.sbw.commands.JoinCommand;
import nfn11.bgui.sbw.commands.LeaveCommand;
import nfn11.bgui.sbw.commands.RejoinCommand;
import nfn11.bgui.sbw.icon.ColorProperty;

public class Main extends Addon {
	
	@Override
	public void onEnable() {
		CommandBuilder.register(LeaveCommand::new, "bedwars-leave");
		CommandBuilder.register(JoinCommand::new, "bedwars-join:");
		CommandBuilder.register(AutojoinCommand::new, "bedwars-auto-join");
		CommandBuilder.register(RejoinCommand::new, "bedwars-rejoin");
		PropertyBuilder.registerItemProperty(ColorProperty::new, "bedwars-apply-color-by-team");
	}
}

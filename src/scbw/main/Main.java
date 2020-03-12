package scbw.main;

import me.hsgamer.bettergui.builder.CommandBuilder;
import me.hsgamer.bettergui.object.addon.Addon;
import scbw.commands.AutojoinCommand;
import scbw.commands.JoinCommand;
import scbw.commands.LeaveCommand;

public class Main extends Addon
{
	  @Override
	  public void onEnable() {
		  CommandBuilder.register("leave", LeaveCommand.class);
		  CommandBuilder.register("join:", JoinCommand.class);
		  CommandBuilder.register("auto-join", AutojoinCommand.class);
	  }
}

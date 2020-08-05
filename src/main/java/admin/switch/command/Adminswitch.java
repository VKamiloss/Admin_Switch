
package admin.switch.command;

import org.bukkit.command.Command;
import org.bukkit.entity.Entity;

public class Adminswitch implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(label.equalsIgnoreCase("adminswitch"))
		{
			double x = 0;
			double y = 0;
			double z = 0;

			Entity entity = null;

			World world = null;

			if (sender instanceof Entity) {
				entity = (Entity) sender;

				x = entity.getLocation().getX();
				y = entity.getLocation().getX();
				z = entity.getLocation().getX();

				world = entity.getWorld();


			} else if (sender instanceof BlockCommandSender) {
				x = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				y = ((BlockCommandSender) sender).getBlock().getLocation().getX();
				z = ((BlockCommandSender) sender).getBlock().getLocation().getX();

				world = ((BlockCommandSender) sender).getBlock().getWorld();
			}

			HashMap<String, String> cmdparams = new HashMap<>();
			int[] index = { -1 };
			Arrays.stream(args).forEach(param -> {
				if(index[0] >= 0)
					cmdparams.put(Integer.toString(index[0]), param);
				index[0]++;
			});

    {
		Map<String, Object> $_dependencies = new HashMap<>();



        AdminswitchCommandExecutedProcedure.executeProcedure($_dependencies);
	}
			return true;
		}
		return false;
	}
}

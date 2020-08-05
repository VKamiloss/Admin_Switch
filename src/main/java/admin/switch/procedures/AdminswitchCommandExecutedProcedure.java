package admin.switch.procedures;

import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.GameMode;

import java.util.Map;

public class AdminswitchCommandExecutedProcedure implements org.bukkit.event.Listener {
	public static void executeProcedure(Map<String, Object> dependencies){
		if(dependencies.get("entity")==null){
			System.err.println("Failed to load dependency entity for procedure AdminswitchCommandExecuted!");
			return;
		}
			Entity entity = (Entity) dependencies.get("entity");
			org.bukkit.entity.Player player = (Player) entity;
		double slot = 0;ItemStack sava = ItemStack.EMPTY;if ((player.getGameMode() == GameMode.NOT_SET)
) {for (int index0 = 0; index0<(int)(); index0++) {}}
	}
}

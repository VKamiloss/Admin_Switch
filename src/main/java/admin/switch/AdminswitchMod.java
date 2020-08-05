/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */

package admin.switch;

import org.bukkit.plugin.java.JavaPlugin;

public class AdminswitchMod extends JavaPlugin {

  @Override
  public void onEnable()
  {
		this.getCommand("Adminswitch").setExecutor(new Adminswitch());
	
		getServer().getPluginManager().registerEvents(new AdminswitchCommandExecutedProcedure(), this);
  }

  @Override
  public void onDisable()
  {

  }
}

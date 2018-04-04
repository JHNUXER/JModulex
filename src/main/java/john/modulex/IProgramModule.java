package john.modulex;

/**
 * Allows for "Modular" program design. I initially created this in order to
 * make one-man projects easier to develop, by breaking it up into smaller
 * projects which can be combined and reused later.
 *
 * @author Johnhoganuke
 */
public interface IProgramModule {
  /**
   * @return A ModuleCommandSet Object which contains all commands that can be
   *         called on this module.
   */
  public ModuleCommandSet getModuleCommands();
  /**
   * @return the current name of this module.
   */
  public String getModuleName();
  /**
   * @param name the new name for this module.
   */
  public void setModuleName(String name);
  /**
   * @return A string which describes the type of module this is.
   */
  public String getModuleType();
}

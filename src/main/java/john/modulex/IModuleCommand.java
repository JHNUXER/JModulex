package john.modulex;

import java.util.*;

/**
 * Allows modules to send and recieve commands to each other without having to
 * know what methods exist ahead of time.
 *
 * @author <a href="jhnuxer.github.io/JHNUXER">Johnhoganuke</a>
 */
public interface IModuleCommand {
  /**
   * @return A String describing this module's functionality.
   */
  public String getDescription();
  /**
   * @param  args All objects to be used as arguments for this command.
   * @return the output of this command.
   */
  public Object exec(Object...args);
}

package re.alwyn974.minecraft.bot.cmd.utils;

import org.jetbrains.annotations.NotNull;

/**
 * The interface for the Command
 *
 * @author <a href="https://github.com/alwyn974">Alwyn974</a>
 * @version 1.0.6
 * @since 1.0.4
 */
public interface ICommand extends Comparable<ICommand> {

    /**
     * Get the command name
     *
     * @return the command name
     */
    String getName();

    /**
     * Get the command prefix
     *
     * @return the command prefix
     */
    default String getPrefix() {
        return CommandHandler.getPrefix();
    }

    /**
     * Get the description of the command
     *
     * @return the description of the command
     */
    String getDescription();

    /**
     * Get the usage of the command
     *
     * @return the usage of the command
     */
    String getUsage();

    /**
     * Specify if the command can be only executed if the bot is connected to a server
     *
     * @return if the bot need to be connected
     */
    boolean needToBeConnected();

    /**
     * The executor of the command
     *
     * @return an executor of the command
     */
    IExecutor executor();

    /**
     * Used to sort the command list
     *
     * @param command the other command
     * @return a value in ASCII like {@link String#compareTo}
     */
    @Override
    default int compareTo(@NotNull ICommand command) {
        return this.getName().compareTo(command.getName());
    }

}

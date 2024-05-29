package Commands;

import Modules.CommandHandler;
import Modules.ConsoleApp;
import Network.Response;
import Network.User;
import data.MusicBandRaw;

public class RemoveByIdCommand implements Command{
    private CommandHandler commandHandler;

    public RemoveByIdCommand(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("removeById", this);
    }

    @Override
    public Response execute(User user, String arguments, MusicBandRaw objectArg) {
        return commandHandler.removeById(user, arguments, objectArg);
    }
}

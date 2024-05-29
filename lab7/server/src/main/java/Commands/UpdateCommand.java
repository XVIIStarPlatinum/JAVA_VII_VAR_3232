package Commands;

import Modules.CommandHandler;
import Modules.ConsoleApp;
import Network.Response;
import Network.User;
import data.MusicBandRaw;

public class UpdateCommand implements Command{
    private CommandHandler commandHandler;

    public UpdateCommand(CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
        ConsoleApp.commandList.put("update", this);
    }

    @Override
    public Response execute(User user, String arguments, MusicBandRaw objectArg) {
        return commandHandler.update(user, arguments, objectArg);
    }
}

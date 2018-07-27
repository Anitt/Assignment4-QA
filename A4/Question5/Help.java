import java.util.HashMap;

public class Help
{
	HashMap<String, Command> commandHashMap = new HashMap<>();

	public Help()
	{
		commandHashMap.put("open", new OpenCommand());
		commandHashMap.put("close", new CloseCommand());
		commandHashMap.put("print", new PrintCommand());
		commandHashMap.put("NoCommand", new AllCommands());
	}

	public String GetHelp(String command)
	{
		return  (command != null && command.length() != 0) ?
				commandHashMap.get(command).GetCommand() :
				commandHashMap.get("NoCommand").GetCommand();

	}

}
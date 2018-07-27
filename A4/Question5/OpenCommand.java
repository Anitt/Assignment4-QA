public class OpenCommand extends Command {
    @Override
    public String GetCommand() {
        return "open -f <path> [-create=0/1]";
    }
}

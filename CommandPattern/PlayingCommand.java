
public  class PlayingCommand implements Command{
    private Device device;

    public PlayingCommand(Device device){
        this.device = device;
    }
    @Override
    public String execute() {
        return device.playing();

    }
}

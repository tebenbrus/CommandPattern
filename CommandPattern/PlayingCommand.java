
public  class PlayingCommand implements Command{
    private Device device;

    public PlayingCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.playing();

    }
}

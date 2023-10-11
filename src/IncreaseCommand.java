public class IncreaseCommand implements Command {
    private Device device;

    public IncreaseCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
            device.increase();





    }


}

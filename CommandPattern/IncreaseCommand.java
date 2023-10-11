public class IncreaseCommand implements Command {
    private Device device;

    public IncreaseCommand(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
           return device.increase();



    }


}

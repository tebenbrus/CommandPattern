public class TurnOnCommand implements Command {
private Device device;
public TurnOnCommand(Device device) {
        this.device = device;
        }
@Override
public String execute() {
        return device.turnOn();

}
}


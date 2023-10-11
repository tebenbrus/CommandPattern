class DecreaseCommand implements Command {
    private Device device;
    public DecreaseCommand(Device device) {
        this.device = device;
    }
    @Override
    public String execute() {
        return device.decrease();

    }
}

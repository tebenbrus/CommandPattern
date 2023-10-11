class DecreaseCommand implements Command {
    private Device device;
    public DecreaseCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.decrease();
    }
}

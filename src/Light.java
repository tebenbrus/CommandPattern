class Light implements Device {
    private String name;
    private int brightnessLevel = 50;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " light is on");
        System.out.println();
    }

    @Override
    public void turnOff() {
        System.out.println(name + " light is off");
        System.out.println();
    }

    @Override
    public boolean increase() {
        brightnessLevel++;
        System.out.println(name + " light brightness increased to " + brightnessLevel);
        System.out.println();
        return false;
    }

    @Override
    public void decrease() {
        brightnessLevel--;
        System.out.println(name + " light brightness decreased to " + brightnessLevel);
        System.out.println();
    }

    @Override
    public void playing() {

    }
}
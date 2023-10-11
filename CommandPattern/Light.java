class Light implements Device {
    private String name;
    private int brightnessLevel = 50;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public String turnOn() {
        System.out.println(name + " light is on");
        System.out.println();
        return null;
    }

    @Override
    public String turnOff() {
        System.out.println(name + " light is off");
        System.out.println();
        return null;
    }

    @Override
    public String increase() {
        brightnessLevel++;
        System.out.println(name + " light brightness increased to " + brightnessLevel);
        System.out.println();
        return null;
    }

    @Override
    public String decrease() {
        brightnessLevel--;
        System.out.println(name + " light brightness decreased to " + brightnessLevel);
        System.out.println();
        return null;
    }

    @Override
    public String playing() {

        return null;
    }
}
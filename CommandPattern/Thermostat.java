public class Thermostat implements Device {
    private int temperature = 20; //set as default

    @Override
    public void turnOn() {
        System.out.println("Thermostat is on");
        System.out.println();
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is off");
        System.out.println();
    }

    @Override
    public boolean increase() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C");
        System.out.println();
        return false;
    }

    @Override
    public void decrease() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C");
        System.out.println();
    }

    @Override
    public void playing() {

    }
}
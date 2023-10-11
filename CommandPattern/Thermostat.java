public class Thermostat implements Device {
    private int temperature = 20; //set as default

    @Override
    public String turnOn() {
        System.out.println("Thermostat is on");
        System.out.println();
        return null;
    }

    @Override
    public String turnOff() {
        System.out.println("Thermostat is off");
        System.out.println();
        return null;
    }

    @Override
    public String increase() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C");
        System.out.println();
        return null;
    }

    @Override
    public String decrease() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C");
        System.out.println();
        return null;
    }

    @Override
    public String playing() {

        return null;
    }
}
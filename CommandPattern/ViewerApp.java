import java.util.Scanner;

public class ViewerApp extends RemoteControl {
    public static void main(String[] args) {

        String name = "LivingRoom";
        Light livingRoomLight = new Light(name);
        MusicPlayer stereo = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        RemoteControl remote = new RemoteControl();

        Scanner scanner = new Scanner(System.in);

        Command turnOnLivingRoomLight = new TurnOnCommand(livingRoomLight);
        Command turnOffLivingRoomLight = new TurnOffCommand(livingRoomLight);
        Command increaseLight = new IncreaseCommand(livingRoomLight);
        Command decreaseLight = new DecreaseCommand(livingRoomLight);
        Command turnOnStereo = new TurnOnCommand(stereo);
        Command turnOffStereo = new TurnOffCommand(stereo);
        Command increaseVolume = new IncreaseCommand(stereo);
        Command decreaseVolume = new DecreaseCommand(stereo);
        Command turnOnThermostat = new TurnOnCommand(thermostat);
        Command turnOffThermostat = new TurnOnCommand(thermostat);
        Command increaseTemperature = new IncreaseCommand(thermostat);
        Command decreaseTemperature = new DecreaseCommand(thermostat);
        Command nowPlaying = new PlayingCommand(stereo);



        while (true) {
            System.out.println("-------------------------------");
            System.out.println("| Smart Home Automation Option |");
            System.out.println("-------------------------------");
            System.out.println("1.  Turn on Living room light");
            System.out.println("2.  Turn off Living room light");
            System.out.println("3.  Increase Light");
            System.out.println("4.  Decrease Light");
            System.out.println("5.  Turn on Music");
            System.out.println("6.  Turn off Music");
            System.out.println("7.  Increase Volume");
            System.out.println("8.  Decrease Volume");
            System.out.println("9.  Turn on ThermoStat");
            System.out.println("10. Turn off ThermoStat");
            System.out.println("11. Increase Temperature");
            System.out.println("12. Decrease Temperature");
            System.out.println("13. Set Playlist");
            System.out.println("14. Exit...");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   remote.addCommand(turnOnLivingRoomLight);
                    break;
                case 2:
                 remote.addCommand(turnOffLivingRoomLight);
                    break;
                case 3:
                    remote.addCommand(increaseLight);
                    break;
                case 4:remote.addCommand(decreaseLight);
                    break;
                case 5:
                    remote.addCommand(turnOnStereo);
                    break;
                case 6:
                    remote.addCommand(turnOffStereo);
                    break;
                case 7: remote.addCommand(increaseVolume);
                    break;
                case 8: remote.addCommand(decreaseVolume);
                    break;
                case 9: remote.addCommand(turnOnThermostat);
                    break;
                case 10: remote.addCommand(turnOffThermostat);
                    break;
                case 11:  remote.addCommand(increaseTemperature);
                    break;
                case 12:  remote.addCommand(decreaseTemperature);
                    break;
                case 13:  remote.addCommand(nowPlaying);
                    break;
                case 14:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            remote.executeCommands();
        }
    }
}

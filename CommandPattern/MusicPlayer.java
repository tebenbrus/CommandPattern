import java.util.Scanner;

class MusicPlayer implements Device {
    private String playing;
    private int volume = 0;
    private String playlist = "Default Playlist";
    @Override
    public String turnOn() {
        System.out.println("Music player is on");


        return null;
    }

    @Override
    public String turnOff() {
        System.out.println("Music player is off");
        System.out.println();

        return null;
    }

    @Override
    public String increase() {
        volume++;
        System.out.println("Volume increased to " + volume);
        System.out.println();
        return null;
    }
    @Override
    public String decrease() {
        volume--;
        System.out.println("Volume decreased to " + volume);
        System.out.println();
        return null;
    }
    public String playing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current Playlist: " + playlist);
        System.out.print("Enter a new playlist name (or press Enter to keep the current playlist): ");
        String newPlaylist = sc.nextLine().trim();
        if (!newPlaylist.isEmpty()) {
            playlist = newPlaylist;
            System.out.println("Playlist set to: " + playlist);
        }
        System.out.println();
        return null;
    }
}
import java.util.Scanner;

class MusicPlayer implements Device {
    private boolean playing = false;
    private int volume = 0;
    private String playlist = "Default Playlist";
    @Override
    public void turnOn() {
        System.out.println("Music player is on");

        playing = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Music player is off");
        System.out.println();
        playing = false;
    }

    @Override
    public boolean increase() {
        volume++;
        System.out.println("Volume increased to " + volume);
        System.out.println();
        return false;
    }
    @Override
    public void decrease() {
        volume--;
        System.out.println("Volume decreased to " + volume);
        System.out.println();
    }
    public void playing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current Playlist: " + playlist);
        System.out.print("Enter a new playlist name (or press Enter to keep the current playlist): ");
        String newPlaylist = sc.nextLine().trim();
        if (!newPlaylist.isEmpty()) {
            playlist = newPlaylist;
            System.out.println("Playlist set to: " + playlist);
        }
        System.out.println();
    }
}
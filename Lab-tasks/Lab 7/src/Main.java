
// SP25-BCS-151
public class Main {
    public static void main(String[] args) {

        Playlist p = new Playlist();

        p.addsong(1, "song A", "Artist 1", 200);
        p.addsong(2, "song B", "Artist 2", 180);
        p.addsong(3, "song C", "Artist 3", 220);

        System.out.println("Playlist:");
        p.display();

        System.out.println();
        System.out.println("Play Songs:");
        p.play(5);

        System.out.println("\nNext:");
        p.nextsong();

        System.out.println();
        System.out.println("Previous:");
        p.previoussong();

        System.out.println();
        System.out.println("Shuffle:");
        p.shuffle();

        System.out.println("\nRemove Song id");
        p.removesong(2);

        System.out.println("\nUpdated Playlist:");
        p.display();
    }
}
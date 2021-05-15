package Assignment.Innerclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMain {

    //make this method as main for testing innr classes
    public static void testmain(String args[]){
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("StormBringer", 4.6);
        album.addSong("Love don't mean a thing", 4.2);
        album.addSong("Holy man", 4.33);
        album.addSong("Hold on", 5.22);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("You can't do it right", 3.5);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 3.78);
        album.addSong("Soldier of fortune", 3.21);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 4.6);
        album.addSong("I put the finger on you", 4.2);
        album.addSong("Let's go", 4.33);
        album.addSong("Inject the venom", 5.22);
        album.addSong("Snowballed", 4.6);
        album.addSong("Evil works", 3.5);
        album.addSong("C.O.D.", 4.27);
        album.addSong("Breaking the rules", 3.78);
        album.addSong("Night of long knives", 3.21);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right",playlist);
        albums.get(0).addToPlayList("Holy man",playlist);
        albums.get(0).addToPlayList("Speed King",playlist);
        albums.get(0).addToPlayList(9,playlist);
        albums.get(1).addToPlayList(3,playlist);
        albums.get(1).addToPlayList(2,playlist);
        albums.get(1).addToPlayList(24,playlist);
        System.out.println("Songs in playList"+playlist.size());
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i));
        }
    }
}

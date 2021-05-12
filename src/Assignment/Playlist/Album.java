package Assignment.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        Song song = findSong(title);
        if(song == null) {
            song = new Song(title,duration);
            this.songs.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song checkSong: this.songs){
            if(checkSong.getTitle().compareTo(title) == 0)
                return checkSong;
        }
        return null;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playList){

        if(trackNo > 0  && trackNo <= this.songs.size()){
            playList.add(this.songs.get(trackNo-1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if(song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }
}


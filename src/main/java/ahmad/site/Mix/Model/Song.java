package ahmad.site.Mix.Model;

public class Song {

    private Artist artist;
    private String song_name;
    private String song_details;
    private int   song_ID;
    private String song_url;
    private String clipart_url;

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_details() {
        return song_details;
    }

    public void setSong_details(String song_details) {
        this.song_details = song_details;
    }

    public int getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(int song_ID) {
        this.song_ID = song_ID;
    }

    public String getClipart_url() {
        return clipart_url;
    }

    public void setClipart_url(String clipart_url) {
        this.clipart_url = clipart_url;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }
}

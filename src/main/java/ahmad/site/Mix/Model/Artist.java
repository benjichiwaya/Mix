package ahmad.site.Mix.Model;

import java.util.List;

public class Artist {

    private User User_artist;
    private String Profile_details;
    private String Prfile_url;
    private int Artist_ID;
    private List<Song> Album; // The album attribute is a list of songs which are tied to the artist.
    private String Location; // Is the artists locations or area where they want to associate their music
    private String Heat; // This attribute will keep track of artists popularity based on
                         // how many listens/favorites/views they get

    public User getUser_artist() {
        return User_artist;
    }
    public void setUser_artist(User user_artist) {
        User_artist = user_artist;
    }
    public String getProfile_details() {
        return Profile_details;
    }
    public void setProfile_details(String profile_details) {
        Profile_details = profile_details;
    }
    public int getArtist_ID() {
        return Artist_ID;
    }
    public void setArtist_ID(int artist_ID) {
        Artist_ID = artist_ID;
    }
    public String getPrfile_url() {
        return Prfile_url;
    }
    public void setPrfile_url(String prfile_url) {
        Prfile_url = prfile_url;
    }

    public List<Song> getAlbum() {
        return Album;
    }

    public void setAlbum(List<Song> album) {
        Album = album;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getHeat() {
        return Heat;
    }

    public void setHeat(String heat) {
        Heat = heat;
    }
}

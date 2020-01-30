package ahmad.site.Mix.Model;

public class Artist {

    private User User_artist;
    private String Profile_details;
    private String Prfile_url;
    private int Artist_ID;


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
}

package LastFM;

public class Artist {

    private String artistName;
    private String bioArtist;
    private String imageUrl;


    public Artist(String artistName, String bioArtist, String imageUrl) {
        this.artistName=artistName;
        this.bioArtist = bioArtist;
        this.imageUrl = imageUrl;

    }

    public void setArtistName(String artistName) {
        this.artistName=artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setBioArtist(String bioArtist) {
        this.bioArtist = bioArtist;
    }

    public String getBioArtist() {
        return bioArtist;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}

}


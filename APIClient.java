package LastFM;

public interface APIClient {
    Artist getArtistFromResponse(String artistName) throws Exception;
}

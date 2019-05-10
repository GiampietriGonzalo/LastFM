package LastFM;

public interface ResponseManager {
    Artist getArtistCardFromResponse(String responseBody) throws Exception;
}

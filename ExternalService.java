package LastFM;

public interface ExternalService {
    Artist getArtist(String artistName) throws Exception;
}

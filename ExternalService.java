package ayds.spotisong.aurora.otherdetails.model.repository.external;
import ayds.spotisong.aurora.otherdetails.model.repository.Artist;

public interface ExternalService {
    Artist getArtist(String artistName) throws Exception;
}

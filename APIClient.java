package ayds.spotisong.aurora.otherdetails.model.repository.external.lastFM;

import ayds.spotisong.aurora.otherdetails.model.repository.Artist;

public interface APIClient {
    Artist getArtistFromResponse(String artistName) throws Exception;
}

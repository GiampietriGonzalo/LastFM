package ayds.spotisong.aurora.otherdetails.model.repository.external.lastFM;

import ayds.spotisong.aurora.otherdetails.model.repository.Artist;

public interface ResponseManager {
    Artist getArtistCardFromResponse(String responseBody) throws Exception;
}

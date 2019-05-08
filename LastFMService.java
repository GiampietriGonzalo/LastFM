package ayds.spotisong.aurora.otherdetails.model.repository.external.lastFM;

import ayds.spotisong.aurora.otherdetails.model.repository.external.ExternalService;
import ayds.spotisong.aurora.otherdetails.model.repository.Artist;

class LastFMService implements ExternalService {

    private APIClient apiClient;

    public LastFMService(APIClient apiClient){
        this.apiClient = apiClient;
    }

    public Artist getArtist(String artistName) throws Exception{
        return apiClient.getArtistFromResponse(artistName);
    }
}

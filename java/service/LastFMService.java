package service;

class LastFMService implements ExternalService {

    private APIClient apiClient;

    public LastFMService(APIClient apiClient){
        this.apiClient = apiClient;
    }

    public Artist getArtist(String artistName) throws Exception{
        return apiClient.getArtistFromResponse(artistName);
    }
}

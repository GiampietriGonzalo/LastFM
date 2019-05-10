package LastFM;

import retrofit2.Response;

class APIClientImp implements APIClient{

    private ResponseManager responseManager;
    private LastFMAPI lastFMAPI;

    APIClientImp(ResponseManager responseManager, LastFMAPI lastFMAPI){
        this.responseManager = responseManager;
        this.lastFMAPI = lastFMAPI;
    }

    @Override
    public Artist getArtistFromResponse(String artistName) throws Exception{
        Response<String> artistBioResponse = null;

        try{
            artistBioResponse = lastFMAPI.getArtistInfo(artistName).execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return responseManager.getArtistCardFromResponse(artistBioResponse.body());
    }
}

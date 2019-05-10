package LastFM;

public class LastFMModule {

    private static LastFMModule instance;
    private final ExternalService externalService;

    private LastFMModule() {
        RequestBuilder requestBuilder = new RequestBuilderImp();
        ResponseManager responseManager = new ResponseManagerImp();
        APIClient apiClient = new APIClientImp(responseManager, requestBuilder.buildRequest().create(LastFMAPI.class));
        externalService = new LastFMService(apiClient);
    }

    public static LastFMModule getInstance() {
        if (instance == null) {
            instance = new LastFMModule();
        }
        return instance;
    }

    public ExternalService getExternalService(){
        return externalService;
    }
}

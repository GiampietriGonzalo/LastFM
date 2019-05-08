package ayds.spotisong.aurora.otherdetails.model.repository.external;


import ayds.spotisong.aurora.otherdetails.model.repository.external.lastFM.LastFMModule;

public class ExternalModule {

    private static ExternalModule instance;

    private ExternalModule(){}

    public static ExternalModule getInstance() {
        if (instance == null) {
            instance = new ExternalModule();
        }
        return instance;
    }

    public ExternalService getExternalService() {
        return LastFMModule.getInstance().getExternalService();
    }
}

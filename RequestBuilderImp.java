package ayds.spotisong.aurora.otherdetails.model.repository.external.lastFM;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

class RequestBuilderImp implements RequestBuilder{

    @Override
    public Retrofit buildRequest() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LastFMConfig.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        return retrofit;
    }
}

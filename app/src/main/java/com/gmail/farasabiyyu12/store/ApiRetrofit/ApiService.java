package com.gmail.farasabiyyu12.store.ApiRetrofit;

import com.gmail.farasabiyyu12.store.ResponseServer.ResponseReadData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * Created by farasabiyyuhandoko on 29/03/2018.
 */

//TODO EndPoint
public interface ApiService {
//    @GET("read_data.php")
//    Call<ResponseReadData> response_read_data();
        @GET("read_data.php")
        Call<ResponseReadData> response_read_data();
}

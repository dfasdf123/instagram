package com.koddev.instagramtest.FCM;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers({
            "Content-Type:application/json",
            ""  // FCM 서버 키
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

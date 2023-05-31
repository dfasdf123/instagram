package com.koddev.instagramtest.FCM;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAqxRc0Cw:APA91bF-OcesLqDX9vYAyzEckUCpq2WUs3bk7pi76obOO4Jmk2k_wxHbL5cKn4ydX0vl34iPjiHrfcKhFhT21YQP-57JT2r4L9ZqP1BlkR5JoGHmNmPzMd8gABLJ3r5KQk_Mv6-kaJj2"  // FCM 서버 키
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
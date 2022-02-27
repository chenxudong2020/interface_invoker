package com.xxx.invoker.api;


import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import com.xxx.invoker.bean.Input;
import com.xxx.invoker.bean.Result;
import com.xxx.invoker.bean.User;
import org.springframework.beans.factory.annotation.Value;
import retrofit2.http.Body;
import retrofit2.http.POST;
@RetrofitClient(baseUrl = "${baseUrl}")
public interface RemoteHttpApI {


    @POST("${getUser}")
    Result<User> getUser(@Body Input input);
}



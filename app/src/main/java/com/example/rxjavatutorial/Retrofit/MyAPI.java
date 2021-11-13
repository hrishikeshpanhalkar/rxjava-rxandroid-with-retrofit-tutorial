package com.example.rxjavatutorial.Retrofit;



import com.example.rxjavatutorial.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyAPI {

    @GET("posts")
    Observable<List<Post>> getPosts();
}

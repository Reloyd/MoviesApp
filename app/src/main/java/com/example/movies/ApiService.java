package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=207ERKJ-PPZ4XY9-JCRA285-9JD8RGP&rating.kp=7-10&sortField=votes.kp&sortType=-1&limit=30&notNullFields=videos.trailers.url")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{idFilms}?token=207ERKJ-PPZ4XY9-JCRA285-9JD8RGP")
    Single<TrailerResponse> getTrailers(@Path("idFilms") int idFilms);

    @GET("review?token=207ERKJ-PPZ4XY9-JCRA285-9JD8RGP")
    Single<ReviewResponse> loadReviews(@Query("movieId") int id);
}

/*
 * Copyright (C) 2015 Teddy Rodriguez (TROD)
 *   email: cia.123trod@gmail.com
 *   github: TROD-123
 *
 * For Udacity's Android Developer Nanodegree
 * P1-2: Popular Movies
 *
 * Currently for educational purposes only.
 */

package com.thirdarm.popularmovies.API;

import com.thirdarm.popularmovies.constant.PARAMS;
import com.thirdarm.popularmovies.model.Images;
import com.thirdarm.popularmovies.model.MovieDB;
import com.thirdarm.popularmovies.model.Results;
import com.thirdarm.popularmovies.model.ReviewsResult;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by TROD on 20150910.
 *
 * Service used to collect and parse JSON data from a server
 * Used for both Asynchronous and Synchronous calls
 *  (uses Retrofit 2.0, by Jake Wharton [Square, Inc., 2015]: http://square.github.io/retrofit/)
 */
public interface APIService {

    /**
     * Gets discovery movies
     *   e.g. https://api.themoviedb.org/3/discover/movie?api_key=###&sort_by=##&language=###&page=###
     *
     * @param key the API key
     * @param sort method to sort discover results
     * @param code the ISO 639-1 language code
     * @param page the page to display
     * @return the response object for TMDB fetch methods
     */
    @GET("discover/movie")
    Call<Results> discover(@Query(PARAMS.GLOBAL.API_KEY) String key,
                           @Query(PARAMS.RESULTS.SORT_BY) String sort,
                           @Query(PARAMS.RESULTS.LANGUAGE) String code,
                           @Query(PARAMS.RESULTS.PAGE) int page);

    /**
     * Gets the latest movie (refreshes everyday)
     *   e.g. https://api.themoviedb.org/3/movie/latest?api_key=###&language=###
     *
     * TODO: Implement this later.
     *
     * @param key the API key
     * @param code the ISO 639-1 language code
     * @return the response object for TMDB fetch methods
     */
    @GET("movie/latest")
    Call<MovieDB> getLatest(@Query(PARAMS.GLOBAL.API_KEY) String key,
                            @Query(PARAMS.RESULTS.LANGUAGE) String code);

    /**
     * Gets a list of results (refreshes everyday)
     *   e.g. https://api.themoviedb.org/3/movie/{category}?api_key=###&language=###&page=###
     *
     * @param category the category of movies to display
     * @param key the API key
     * @param code the ISO 639-1 language code
     * @param page the page to display
     * @return the response object for TMDB fetch methods
     */
    @GET("movie/{category}")
    Call<Results> getResults(@Path("category") String category,
                             @Query(PARAMS.GLOBAL.API_KEY) String key,
                             @Query(PARAMS.RESULTS.LANGUAGE) String code,
                             @Query(PARAMS.RESULTS.PAGE) int page);

    /**
     * Gets individual movie information
     *   e.g. https://api.themoviedb.org/3/movie/550?api_key=###&append_to_response=images,releases,trailers     *
     *
     * Warning: Do not pass too many APPENDS as too many may overload the Intent/Binder
     *   transactions.
     *
     * @param id the TMDB movie id
     * @param key the API key
     * @param appends extra data
     * @return the response object for TMDB fetch methods
     */
    @GET("movie/{id}")
    Call<MovieDB> getMovieDetails(@Path("id") int id,
                                  @Query(PARAMS.GLOBAL.API_KEY) String key,
                                  @Query(PARAMS.MOVIE.APPEND_TO_RESPONSE) String appends);

    /**
     * Gets individual movie images
     *   e.g. https://api.themoviedb.org/3/movie/550/images?api_key=###
     *
     * @param id the TMDB movie id
     * @param key the API key
     * @return the response object for TMDB fetch metods
     */
    @GET("movie/{id}/images")
    Call<Images> getMovieImages(@Path("id") int id,
                                @Query(PARAMS.GLOBAL.API_KEY) String key);

    /**
     * Gets individual movie reviews
     *   e.g. https://api.themoviedb.org/3/movie/550/reviews?api_key=###
     *
     * @param id the TMDB movie id
     * @param key the API key
     * @return the response object for TMDB fetch methods
     */
    @GET("movie/{id}/reviews")
    Call<ReviewsResult> getMovieReviews(@Path("id") int id,
                                        @Query(PARAMS.GLOBAL.API_KEY) String key);

}

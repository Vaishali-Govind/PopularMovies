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

package com.thirdarm.popularmovies.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Handles /discovery results JSON data
 *
 * POJO created using jsonschema2pojo (http://www.jsonschema2pojo.org/). May not work for all
 *  JSON data
 *
 * How it works:
 *  Expose sets the value associated with the key, specified by the name of the variable
 *  SerializedName sets the name of the key for which @Expose will pair the corresponding value
 *   (used for variable names that are different from the key that appears in JSON -
 *    the serialized name is the name of the key as it appears in JSON)
 */
public class Results implements Parcelable {

    @Expose
    private Integer page;

    @SerializedName("results")
    @Expose
    private List<MovieDBResult> movieDBResults = new ArrayList<>();

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    /**
     * @return The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return The movieDBResults
     */
    public List<MovieDBResult> getMovieDBResults() {
        return movieDBResults;
    }

    /**
     * @param movieDBResults The movieDBResults
     */
    public void setMovieDBResults(List<MovieDBResult> movieDBResults) {
        this.movieDBResults = movieDBResults;
    }

    /**
     * @return The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.page);
        dest.writeTypedList(movieDBResults);
        dest.writeValue(this.totalPages);
        dest.writeValue(this.totalResults);
    }

    public Results() {
    }

    protected Results(Parcel in) {
        this.page = (Integer) in.readValue(Integer.class.getClassLoader());
        this.movieDBResults = in.createTypedArrayList(MovieDBResult.CREATOR);
        this.totalPages = (Integer) in.readValue(Integer.class.getClassLoader());
        this.totalResults = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Results> CREATOR = new Parcelable.Creator<Results>() {
        public Results createFromParcel(Parcel source) {
            return new Results(source);
        }

        public Results[] newArray(int size) {
            return new Results[size];
        }
    };
}
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
 * Handles /movie JSON data
 *
 * POJO created using jsonschema2pojo (http://www.jsonschema2pojo.org/). May not work for all
 *  JSON data
 */
public class MovieDB implements Parcelable {

    @Expose
    private Boolean adult;

    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;

    @SerializedName("belongs_to_collection")
    @Expose
    private Collection belongsToCollection;

    @Expose
    private Integer budget;

    @SerializedName("genres")
    @Expose
    private List<Genre> genres = new ArrayList<>();

    @Expose
    private String homepage;

    @Expose
    private Integer id;

    @SerializedName("imdb_id")
    @Expose
    private String imdbId;

    @SerializedName("original_language")
    @Expose
    private String originalLanguage;

    @SerializedName("original_title")
    @Expose
    private String originalTitle;

    @Expose
    private String overview;

    @Expose
    private Double popularity;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @SerializedName("production_companies")
    @Expose
    private List<ProductionCompany> productionCompanies = new ArrayList<>();

    @SerializedName("production_countries")
    @Expose
    private List<ProductionCountry> productionCountries = new ArrayList<>();

    @SerializedName("release_date")
    @Expose
    private String releaseDate;

    @Expose
    private Integer revenue;

    @Expose
    private Integer runtime;

    @SerializedName("spoken_languages")
    @Expose
    private List<SpokenLanguage> spokenLanguages = new ArrayList<>();

    @Expose
    private String status;

    @Expose
    private String tagline;

    @Expose
    private String title;

    @Expose
    private Boolean video;

    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;

    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;

    @SerializedName("alternative_titles")
    @Expose
    private AlternativeTitles alternativeTitles;

    @Expose
    private Credits credits;

    @SerializedName("image")
    @Expose
    private Images images;

    @Expose
    private KeywordsResult keywordsResult;

    @SerializedName("releases")
    @Expose
    private Releases releases;

    @Expose
    private Videos videos;

    @Expose
    private TranslationsResult translationsResult;

    @Expose
    private Similar similar;

    @Expose
    private ReviewsResult reviewsResult;

    @Expose
    private Lists lists;

    @SerializedName("trailers")
    @Expose
    private Trailers trailers;


    /**
     * @return The adult
     */
    public Boolean getAdult() {
        return adult;
    }

    /**
     * @param adult The adult
     */
    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    /**
     * @return The backdropPath
     */
    public String getBackdropPath() {
        return backdropPath;
    }

    /**
     * @param backdropPath The backdrop_path
     */
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    /**
     * @return The belongsToCollection
     */
    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    /**
     * @param belongsToCollection The belongs_to_collection
     */
    public void setBelongsToCollection(Collection belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    /**
     * @return The budget
     */
    public Integer getBudget() {
        return budget;
    }

    /**
     * @param budget The budget
     */
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**
     * @return The genres
     */
    public List<Genre> getGenres() {
        return genres;
    }

    /**
     * @param genres The genres
     */
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    /**
     * @return The homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * @param homepage The homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The imdbId
     */
    public String getImdbId() {
        return imdbId;
    }

    /**
     * @param imdbId The imdb_id
     */
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    /**
     * @return The originalLanguage
     */
    public String getOriginalLanguage() {
        return originalLanguage;
    }

    /**
     * @param originalLanguage The original_language
     */
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    /**
     * @return The originalTitle
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * @param originalTitle The original_title
     */
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    /**
     * @return The overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * @param overview The overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * @return The popularity
     */
    public Double getPopularity() {
        return popularity;
    }

    /**
     * @param popularity The popularity
     */
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    /**
     * @return The posterPath
     */
    public String getPosterPath() {
        return posterPath;
    }

    /**
     * @param posterPath The poster_path
     */
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    /**
     * @return The productionCompanies
     */
    public List<ProductionCompany> getProductionCompanies() {
        return productionCompanies;
    }

    /**
     * @param productionCompanies The production_companies
     */
    public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    /**
     * @return The productionCountries
     */
    public List<ProductionCountry> getProductionCountries() {
        return productionCountries;
    }

    /**
     * @param productionCountries The production_countries
     */
    public void setProductionCountries(List<ProductionCountry> productionCountries) {
        this.productionCountries = productionCountries;
    }

    /**
     * @return The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate The release_date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return The revenue
     */
    public Integer getRevenue() {
        return revenue;
    }

    /**
     * @param revenue The revenue
     */
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    /**
     * @return The runtime
     */
    public Integer getRuntime() {
        return runtime;
    }

    /**
     * @param runtime The runtime
     */
    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    /**
     * @return The spokenLanguages
     */
    public List<SpokenLanguage> getSpokenLanguages() {
        return spokenLanguages;
    }

    /**
     * @param spokenLanguages The spoken_languages
     */
    public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The tagline
     */
    public String getTagline() {
        return tagline;
    }

    /**
     * @param tagline The tagline
     */
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The video
     */
    public Boolean getVideo() {
        return video;
    }

    /**
     * @param video The video
     */
    public void setVideo(Boolean video) {
        this.video = video;
    }

    /**
     * @return The voteAverage
     */
    public Double getVoteAverage() {
        return voteAverage;
    }

    /**
     * @param voteAverage The vote_average
     */
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    /**
     * @return The voteCount
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * @param voteCount The vote_count
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * @return The alternativeTitles
     */
    public AlternativeTitles getAlternativeTitles() {
        return alternativeTitles;
    }

    /**
     * @param alternativeTitles The alternative_titles
     */
    public void setAlternativeTitles(AlternativeTitles alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    /**
     * @return The credits
     */
    public Credits getCredits() {
        return credits;
    }

    /**
     * @param credits The credits
     */
    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    /**
     * @return The images
     */
    public Images getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     * @return The keywordsResult
     */
    public KeywordsResult getKeywordsResult() {
        return keywordsResult;
    }

    /**
     * @param keywordsResult The keywordsResult
     */
    public void setKeywordsResult(KeywordsResult keywordsResult) {
        this.keywordsResult = keywordsResult;
    }

    /**
     * @return The releases
     */
    public Releases getReleases() {
        return releases;
    }

    /**
     * @param releases The releases
     */
    public void setReleases(Releases releases) {
        this.releases = releases;
    }

    /**
     * @return The videos
     */
    public Videos getVideos() {
        return videos;
    }

    /**
     * @param videos The videos
     */
    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    /**
     * @return The translationsResult
     */
    public TranslationsResult getTranslationsResult() {
        return translationsResult;
    }

    /**
     * @param translationsResult The translationsResult
     */
    public void setTranslationsResult(TranslationsResult translationsResult) {
        this.translationsResult = translationsResult;
    }

    /**
     * @return The similar
     */
    public Similar getSimilar() {
        return similar;
    }

    /**
     * @param similar The similar
     */
    public void setSimilar(Similar similar) {
        this.similar = similar;
    }

    /**
     * @return The reviewsResult
     */
    public ReviewsResult getReviewsResult() {
        return reviewsResult;
    }

    /**
     * @param reviewsResult The reviewsResult
     */
    public void setReviewsResult(ReviewsResult reviewsResult) {
        this.reviewsResult = reviewsResult;
    }

    /**
     * @return The lists
     */
    public Lists getLists() {
        return lists;
    }

    /**
     * @param lists The lists
     */
    public void setLists(Lists lists) {
        this.lists = lists;
    }

    /**
     * @return The trailers
     */
    public Trailers getTrailers() {
        return trailers;
    }

    /**
     * @param trailers The trailers
     */
    public void setTrailers(Trailers trailers) {
        this.trailers = trailers;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.adult);
        dest.writeString(this.backdropPath);
        dest.writeParcelable(this.belongsToCollection, 0);
        dest.writeValue(this.budget);
        dest.writeTypedList(genres);
        dest.writeString(this.homepage);
        dest.writeValue(this.id);
        dest.writeString(this.imdbId);
        dest.writeString(this.originalLanguage);
        dest.writeString(this.originalTitle);
        dest.writeString(this.overview);
        dest.writeValue(this.popularity);
        dest.writeString(this.posterPath);
        dest.writeTypedList(productionCompanies);
        dest.writeTypedList(productionCountries);
        dest.writeString(this.releaseDate);
        dest.writeValue(this.revenue);
        dest.writeValue(this.runtime);
        dest.writeTypedList(spokenLanguages);
        dest.writeString(this.status);
        dest.writeString(this.tagline);
        dest.writeString(this.title);
        dest.writeValue(this.video);
        dest.writeValue(this.voteAverage);
        dest.writeValue(this.voteCount);
        dest.writeParcelable(this.alternativeTitles, flags);
        dest.writeParcelable(this.credits, flags);
        dest.writeParcelable(this.images, 0);
        dest.writeParcelable(this.keywordsResult, flags);
        dest.writeParcelable(this.releases, 0);
        dest.writeParcelable(this.videos, flags);
        dest.writeParcelable(this.translationsResult, flags);
        dest.writeParcelable(this.similar, flags);
        dest.writeParcelable(this.reviewsResult, flags);
        dest.writeParcelable(this.lists, flags);
        dest.writeParcelable(this.trailers, 0);
    }

    public MovieDB() {
    }

    protected MovieDB(Parcel in) {
        this.adult = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.backdropPath = in.readString();
        this.belongsToCollection = in.readParcelable(Collection.class.getClassLoader());
        this.budget = (Integer) in.readValue(Integer.class.getClassLoader());
        this.genres = in.createTypedArrayList(Genre.CREATOR);
        this.homepage = in.readString();
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.imdbId = in.readString();
        this.originalLanguage = in.readString();
        this.originalTitle = in.readString();
        this.overview = in.readString();
        this.popularity = (Double) in.readValue(Double.class.getClassLoader());
        this.posterPath = in.readString();
        this.productionCompanies = in.createTypedArrayList(ProductionCompany.CREATOR);
        this.productionCountries = in.createTypedArrayList(ProductionCountry.CREATOR);
        this.releaseDate = in.readString();
        this.revenue = (Integer) in.readValue(Integer.class.getClassLoader());
        this.runtime = (Integer) in.readValue(Integer.class.getClassLoader());
        this.spokenLanguages = in.createTypedArrayList(SpokenLanguage.CREATOR);
        this.status = in.readString();
        this.tagline = in.readString();
        this.title = in.readString();
        this.video = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.voteAverage = (Double) in.readValue(Double.class.getClassLoader());
        this.voteCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.alternativeTitles = in.readParcelable(AlternativeTitles.class.getClassLoader());
        this.credits = in.readParcelable(Credits.class.getClassLoader());
        this.images = in.readParcelable(Images.class.getClassLoader());
        this.keywordsResult = in.readParcelable(KeywordsResult.class.getClassLoader());
        this.releases = in.readParcelable(Releases.class.getClassLoader());
        this.videos = in.readParcelable(Videos.class.getClassLoader());
        this.translationsResult = in.readParcelable(TranslationsResult.class.getClassLoader());
        this.similar = in.readParcelable(Similar.class.getClassLoader());
        this.reviewsResult = in.readParcelable(ReviewsResult.class.getClassLoader());
        this.lists = in.readParcelable(Lists.class.getClassLoader());
        this.trailers = in.readParcelable(Trailers.class.getClassLoader());
    }

    public static final Parcelable.Creator<MovieDB> CREATOR = new Parcelable.Creator<MovieDB>() {
        public MovieDB createFromParcel(Parcel source) {
            return new MovieDB(source);
        }

        public MovieDB[] newArray(int size) {
            return new MovieDB[size];
        }
    };
}

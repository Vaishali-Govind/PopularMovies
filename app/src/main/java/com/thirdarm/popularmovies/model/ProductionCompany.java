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

import com.google.gson.annotations.Expose;

/**
 * Created by TROD on 20150913.
 *
 * POJO created using jsonschema2pojo (http://www.jsonschema2pojo.org/). May not work for all
 *  JSON data
 */
public class ProductionCompany implements Parcelable {

    @Expose
    private String name;

    @Expose
    private Integer id;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeValue(this.id);
    }

    public ProductionCompany() {
    }

    protected ProductionCompany(Parcel in) {
        this.name = in.readString();
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<ProductionCompany> CREATOR = new Creator<ProductionCompany>() {
        public ProductionCompany createFromParcel(Parcel source) {
            return new ProductionCompany(source);
        }

        public ProductionCompany[] newArray(int size) {
            return new ProductionCompany[size];
        }
    };
}
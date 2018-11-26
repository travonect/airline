package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Origin {

    @SerializedName("AirportObject")
    private Airport airportObject;
    @SerializedName("DepTime")
    private String depTime;

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String DepTime) {
        this.depTime = DepTime;
    }

    public Airport getAirportObject() {
        return airportObject;
    }

    public void setAirportObject(Airport airportObject) {
        this.airportObject = airportObject;
    }
}

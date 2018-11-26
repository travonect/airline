
package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Destination {
    @SerializedName("AirportObject")
    private Airport airportObject;
    @SerializedName("ArrTime")
    private String arrTime;

    public String getArrTime() {
        return arrTime;
    }
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public Airport getAirportObject() {
        return airportObject;
    }

    public void setAirportObject(Airport airportObject) {
        this.airportObject = airportObject;
    }
}

package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Airline {

    @SerializedName("AirlineCode")
    private String airlineCode;
    @SerializedName("AirlineName")
    private String airlineName;
    @SerializedName("FlightNumber")
    private String flightNumber;
    @SerializedName("FareClass")
    private String fareClass;
    @SerializedName("OperatingCarrier")
    private String operatingCarrier;

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFareClass() {
        return fareClass;
    }

    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }
}

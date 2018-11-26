package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Airport {

    @SerializedName("AirportCode")
    private String airportCode;
    @SerializedName("AirportName")
    private String airportName;
    @SerializedName("Terminal")
    private String terminal;
    @SerializedName("CityCode")
    private String cityCode;
    @SerializedName("CityName")
    private String cityName;
    @SerializedName("CountryCode")
    private String countryCode;
    @SerializedName("CountryName")
    private String countryName;

    public String getAirportCode() {
        return airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

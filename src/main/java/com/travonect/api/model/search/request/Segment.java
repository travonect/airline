
package com.travonect.api.model.search.request;

import com.google.gson.annotations.SerializedName;

public class Segment {
    @SerializedName("Origin")
    private String origin;
    @SerializedName("Destination")
    private String destination;
    @SerializedName("FlightCabinClass")
    private String flightCabinClass;
    @SerializedName("PreferredDepartureTime")
    private String preferredDepartureTime;
    @SerializedName("PreferredArrivalTime")
    private String preferredArrivalTime;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightCabinClass() {
        return flightCabinClass;
    }

    public String getPreferredDepartureTime() {
        return preferredDepartureTime;
    }

    public String getPreferredArrivalTime() {
        return preferredArrivalTime;
    }

    public void setOrigin(String Origin) {
        this.origin = Origin;
    }

    public void setDestination(String Destination) {
        this.destination = Destination;
    }

    public void setFlightCabinClass(String FlightCabinClass) {
        this.flightCabinClass = FlightCabinClass;
    }

    public void setPreferredDepartureTime(String PreferredDepartureTime) {
        this.preferredDepartureTime = PreferredDepartureTime;
    }

    public void setPreferredArrivalTime(String PreferredArrivalTime) {
        this.preferredArrivalTime = PreferredArrivalTime;
    }
}

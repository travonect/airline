package com.travonect.api.model.trip;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trips")
public class Trip {
    @Id
    private String tripId;
    private TripDetails tripDetails;
    private TravellingInfo travellingInfo;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public TripDetails getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(TripDetails tripDetails) {
        this.tripDetails = tripDetails;
    }

    public TravellingInfo getTravellingInfo() {
        return travellingInfo;
    }

    public void setTravellingInfo(TravellingInfo travellingInfo) {
        this.travellingInfo = travellingInfo;
    }
    
}


package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Segment {
    @SerializedName("Baggage")
    private String baggage;
    @SerializedName("CabinBaggage")
    private String cabinBaggage;
    @SerializedName("TripIndicator")
    private float tripIndicator;
    @SerializedName("SegmentIndicator")
    private float segmentIndicator;
    @SerializedName("AirlineObject")
    private Airline airlineObject;
    @SerializedName("NoOfSeatAvailable")
    private float noOfSeatAvailable;
    @SerializedName("OriginObject")
    private Origin originObject;
    @SerializedName("DestinationObject")
    private Destination destinationObject;
    @SerializedName("Duration")
    private float duration;
    @SerializedName("GroundTime")
    private float groundTime;
    @SerializedName("Mile")
    private float mile;
    @SerializedName("StopOver")
    private boolean stopOver;
    @SerializedName("StopPoint")
    private String stopPoint;
    @SerializedName("StopPointArrivalTime")
    private String stopPointArrivalTime;
    @SerializedName("StopPointDepartureTime")
    private String stopPointDepartureTime;
    @SerializedName("Craft")
    private String craft;
    @SerializedName("Remark")
    private String remark;
    @SerializedName("IsETicketEligible")
    private boolean isETicketEligible;
    @SerializedName("FlightStatus")
    private String flightStatus;
    @SerializedName("Status")
    private String status;

    public String getBaggage() {
        return baggage;
    }

    public String getCabinBaggage() {
        return cabinBaggage;
    }

    public float getTripIndicator() {
        return tripIndicator;
    }

    public float getSegmentIndicator() {
        return segmentIndicator;
    }

    public Airline getAirline() {
        return airlineObject;
    }

    public float getNoOfSeatAvailable() {
        return noOfSeatAvailable;
    }

    public Origin getOrigin() {
        return originObject;
    }

    public Destination getDestination() {
        return destinationObject;
    }

    public float getDuration() {
        return duration;
    }

    public float getGroundTime() {
        return groundTime;
    }

    public float getMile() {
        return mile;
    }

    public boolean getStopOver() {
        return stopOver;
    }

    public String getStopPoint() {
        return stopPoint;
    }

    public String getStopPointArrivalTime() {
        return stopPointArrivalTime;
    }

    public String getStopPointDepartureTime() {
        return stopPointDepartureTime;
    }

    public String getCraft() {
        return craft;
    }

    public String getRemark() {
        return remark;
    }

    public boolean getIsETicketEligible() {
        return isETicketEligible;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public void setCabinBaggage(String cabinBaggage) {
        this.cabinBaggage = cabinBaggage;
    }

    public void setTripIndicator(float tripIndicator) {
        this.tripIndicator = tripIndicator;
    }

    public void setSegmentIndicator(float segmentIndicator) {
        this.segmentIndicator = segmentIndicator;
    }

    public void setAirline(Airline airlineObject) {
        this.airlineObject = airlineObject;
    }

    public void setNoOfSeatAvailable(float noOfSeatAvailable) {
        this.noOfSeatAvailable = noOfSeatAvailable;
    }

    public void setOrigin(Origin originObject) {
        this.originObject = originObject;
    }

    public void setDestination(Destination destinationObject) {
        this.destinationObject = destinationObject;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setGroundTime(float groundTime) {
        this.groundTime = groundTime;
    }

    public void setMile(float mile) {
        this.mile = mile;
    }

    public void setStopOver(boolean stopOver) {
        this.stopOver = stopOver;
    }

    public void setStopPoint(String stopPoint) {
        this.stopPoint = stopPoint;
    }

    public void setStopPointArrivalTime(String stopPointArrivalTime) {
        this.stopPointArrivalTime = stopPointArrivalTime;
    }

    public void setStopPointDepartureTime(String stopPointDepartureTime) {
        this.stopPointDepartureTime = stopPointDepartureTime;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setIsETicketEligible(boolean isETicketEligible) {
        this.isETicketEligible = isETicketEligible;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}












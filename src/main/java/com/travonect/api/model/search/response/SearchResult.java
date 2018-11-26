package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class SearchResult {
@SerializedName("ResultIndex")
    private String resultIndex;
    @SerializedName("Source")
    private float source;
    @SerializedName("IsLCC")
    private boolean isLCC;
    @SerializedName("IsRefundable")
    private boolean isRefundable;
    @SerializedName("GSTAllowed")
    private boolean gstAllowed;
    @SerializedName("IsGSTMandatory")
    private boolean isGSTMandatory;
    @SerializedName("AirlineRemark")
    private String airlineRemark;
    @SerializedName("FareObject")
    private Fare fareObject;
    @SerializedName("FareBreakdown")
    private List<Object> fareBreakdown;
    @SerializedName("Segments")
    private List<Segment> segments;
    @SerializedName("LastTicketDate")
    private String lastTicketDate;
    @SerializedName("TicketAdvisory")
    private String ticketAdvisory ;
    @SerializedName("FareRules")
    private List<Object> fareRules;
    @SerializedName("AirlineCode")
    private String airlineCode;
    @SerializedName("ValidatingAirline")
    private String validatingAirline;

    public String getResultIndex() {
        return resultIndex;
    }

    public float getSource() {
        return source;
    }

    public boolean getIsLCC() {
        return isLCC;
    }

    public boolean getIsRefundable() {
        return isRefundable;
    }

    public boolean getGSTAllowed() {
        return gstAllowed;
    }

    public boolean getIsGSTMandatory() {
        return isGSTMandatory;
    }

    public String getAirlineRemark() {
        return airlineRemark;
    }

    public Fare getFare() {
        return fareObject;
    }

    public String getLastTicketDate() {
        return lastTicketDate;
    }

    public String getTicketAdvisory() {
        return ticketAdvisory;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getValidatingAirline() {
        return validatingAirline;
    }

    public void setResultIndex(String resultIndex) {
        this.resultIndex = resultIndex;
    }

    public void setSource(float source) {
        this.source = source;
    }

    public void setIsLCC(boolean isLCC) {
        this.isLCC = isLCC;
    }

    public void setIsRefundable(boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    public void setGSTAllowed(boolean gstAllowed) {
        this.gstAllowed = gstAllowed;
    }

    public void setIsGSTMandatory(boolean isGSTMandatory) {
        this.isGSTMandatory = isGSTMandatory;
    }

    public void setAirlineRemark(String AirlineRemark) {
        this.airlineRemark = AirlineRemark;
    }

    public void setFare(Fare FareObject) {
        this.fareObject = FareObject;
    }

    public void setLastTicketDate(String LastTicketDate) {
        this.lastTicketDate = LastTicketDate;
    }

    public void setTicketAdvisory(String ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public void setValidatingAirline(String validatingAirline) {
        this.validatingAirline = validatingAirline;
    }

    public Fare getFareObject() {
        return fareObject;
    }

    public void setFareObject(Fare fareObject) {
        this.fareObject = fareObject;
    }

    public List<Object> getFareBreakdown() {
        return fareBreakdown;
    }

    public void setFareBreakdown(List<Object> fareBreakdown) {
        this.fareBreakdown = fareBreakdown;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(ArrayList<Segment> segments) {
        this.segments = segments;
    }

    public List<Object> getFareRules() {
        return fareRules;
    }

    public void setFareRules(ArrayList<Object> fareRules) {
        this.fareRules = fareRules;
    }
}


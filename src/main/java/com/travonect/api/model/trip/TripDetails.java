package com.travonect.api.model.trip;

public class TripDetails {
    
    private String flightNo;
    private String airlinesName;
    private String airlinesCode;
    private String scheduleStatus;
    private Source source;
    private Destination Destination;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Destination getDestination() {
        return Destination;
    }

    public void setDestination(Destination Destination) {
        this.Destination = Destination;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public String getAirlinesCode() {
        return airlinesCode;
    }

    public void setAirlinesCode(String airlinesCode) {
        this.airlinesCode = airlinesCode;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }
    
}

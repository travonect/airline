package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Response {

    @SerializedName("ResponseStatus")
    private float responseStatus;
    @SerializedName("ErrorObject")
    private Error errorObject;
    @SerializedName("TraceId")
    private String traceId;
    @SerializedName("Origin")
    private String origin;
    @SerializedName("Destination")
    private String destination;
    @SerializedName("Results")
    private List<Object> results;

    public float getResponseStatus() {
        return responseStatus;
    }

    public Error getError() {
        return errorObject;
    }

    public String getTraceId() {
        return traceId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Error getErrorObject() {
        return errorObject;
    }

    public List<Object> getResults() {
        return results;
    }

    public void setResponseStatus(float responseStatus) {
        this.responseStatus = responseStatus;
    }

    public void setError(Error errorObject) {
        this.errorObject = errorObject;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setErrorObject(Error errorObject) {
        this.errorObject = errorObject;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }
}

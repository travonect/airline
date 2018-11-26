
package com.travonect.api.model.search.request;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SearchRequest {
    @SerializedName("EndUserIp")
    private String endUserIp;
    @SerializedName("TokenId")
    private String tokenId;
    @SerializedName("AdultCount")
    private String adultCount;
    @SerializedName("ChildCount")
    private String childCount;
    @SerializedName("InfantCount")
    private String infantCount;
    @SerializedName("DirectFlight")
    private String directFlight;
    @SerializedName("OneStopFlight")
    private String oneStopFlight;
    @SerializedName("JourneyType")
    private String journeyType;
    @SerializedName("PreferredAirlines")
    private String preferredAirlines;
    @SerializedName("Segments")
    private List<Segment> segments;
    @SerializedName("Sources")
    private List<String> sources;

    public String getEndUserIp() {
        return endUserIp;
    }

    public String getTokenId() {
        return tokenId;
    }

    public String getAdultCount() {
        return adultCount;
    }

    public String getChildCount() {
        return childCount;
    }

    public String getInfantCount() {
        return infantCount;
    }

    public String getDirectFlight() {
        return directFlight;
    }

    public String getOneStopFlight() {
        return oneStopFlight;
    }

    public String getJourneyType() {
        return journeyType;
    }

    public String getPreferredAirlines() {
        return preferredAirlines;
    }

    public void setEndUserIp(String EndUserIp) {
        this.endUserIp = EndUserIp;
    }

    public void setTokenId(String TokenId) {
        this.tokenId = TokenId;
    }

    public void setAdultCount(String AdultCount) {
        this.adultCount = AdultCount;
    }

    public void setChildCount(String ChildCount) {
        this.childCount = ChildCount;
    }

    public void setInfantCount(String InfantCount) {
        this.infantCount = InfantCount;
    }

    public void setDirectFlight(String DirectFlight) {
        this.directFlight = DirectFlight;
    }

    public void setOneStopFlight(String OneStopFlight) {
        this.oneStopFlight = OneStopFlight;
    }

    public void setJourneyType(String JourneyType) {
        this.journeyType = JourneyType;
    }

    public void setPreferredAirlines(String PreferredAirlines) {
        this.preferredAirlines = PreferredAirlines;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> Segments) {
        this.segments = Segments;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> Sources) {
        this.sources = Sources;
    }
}

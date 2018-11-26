package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;


public class SearchResponse {

    @SerializedName("ResponseObject")
    Response responseObject;

    // Getter Methods 
    public Response getResponse() {
        return responseObject;
    }

    // Setter Methods 
    public void setResponse(Response responseObject) {
        this.responseObject = responseObject;
    }
}






package com.travonect.api.model.search.response;

import com.google.gson.annotations.SerializedName;

public class Error {

    @SerializedName("ErrorCode")
    private float errorCode;
    @SerializedName("ErrorMessage")
    private String errorMessage;

    // Getter Methods 
    public float getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    // Setter Methods 
    public void setErrorCode(float errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
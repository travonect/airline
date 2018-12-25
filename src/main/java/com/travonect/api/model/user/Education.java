package com.travonect.api.model.user;

public class Education {
    
    private String degree;
    private String institution;
    private Long startYear;
    private Long endYear;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Long getStartYear() {
        return startYear;
    }

    public void setStartYear(Long startYear) {
        this.startYear = startYear;
    }

    public Long getEndYear() {
        return endYear;
    }

    public void setEndYear(Long endYear) {
        this.endYear = endYear;
    }
    
}

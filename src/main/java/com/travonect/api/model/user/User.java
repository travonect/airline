package com.travonect.api.model.user;

import com.travonect.api.model.trip.Trip;
import org.springframework.data.annotation.Id;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String email;
    private String gender;
    private String name;
    private String jobTitle;
    private String organization;
    private List<Picture> pictures;
    private String city;
    private String nationality;
    private Education education;
    private List<Trip> trips;
    private String aboutMe;
    private UserBasicInfo userBasicInfo;

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }
    
    public String getNationality() {
        return nationality;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationality(String nat) {
        this.nationality = nat;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public UserBasicInfo getUserBasicInfo() {
        return userBasicInfo;
    }

    public void setUserBasicInfo(UserBasicInfo userBasicInfo) {
        this.userBasicInfo = userBasicInfo;
    }
}

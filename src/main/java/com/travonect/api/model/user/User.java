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
    private Name name;
    private Address location;
    private Login login;
    private Dob dob;
    private Profession profession;
    private String phone;
    private String cell;
    private Picture picture;
    private String nationality;
    private Education education;
    private List<Trip> trips;
    private String aboutMe;

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public Address getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public Login getLogin() {
        return login;
    }

    public Dob getDob() {
        return dob;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public Picture getPicture() {
        return picture;
    }

    public String getNationality() {
        return nationality;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(Name nameObject) {
        this.name = nameObject;
    }

    public void setLocation(Address locationObject) {
        this.location = locationObject;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(Login loginObject) {
        this.login = loginObject;
    }

    public void setDob(Dob dobObject) {
        this.dob = dobObject;
    }

    public void setProfession(Profession registeredObject) {
        this.profession = registeredObject;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
    
    public void setPicture(Picture pictureObject) {
        this.picture = pictureObject;
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
}

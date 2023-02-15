package com.factory.appraisal.vehiclesearchapp.dto;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EConfigCodes;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerReg;
import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EUserRegisterDto {
    @NotNull
    @Size(max = 15)
    private Long id;
    @Size(max = 10)
    private String apartmentNumber;
    @NotNull
    @Size(max = 10)
    private String city;
    @NotNull
    @Email(message = "invalid email id")
    @Size(max = 50)
    private String email;
    @NotNull
    @Size(max = 15)
    private String firstName;
    @NotNull
    @Size(max = 15)
    private String lastName;
    @NotNull
    @Size(max = 20)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public EConfigCodes getRoleId() {
        return roleId;
    }

    public void setRoleId(EConfigCodes roleId) {
        this.roleId = roleId;
    }

    public EDealerReg getDealerId() {
        return dealerId;
    }

    public void setDealerId(EDealerReg dealerId) {
        this.dealerId = dealerId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @NotNull
    @Size(max = 13)
    @Pattern(regexp = "^\\+1\\s\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}$")
    /* Some valid examples of phone numbers
    +1 (555) 123-4567
    +1 555 123-4567
    +1 5551234567     */
    private String phoneNumber;
    @NotNull
    @Size(max = 10)
    private String state;
    @NotNull
    @Size(max = 50)
    private String streetAddress;
    @NotNull
    @Size(max = 30)
    private String userName;
    @NotNull
    @Size(max = 5)
    private String zipCode;
    @NotNull
    @Size(max = 15)
    private EConfigCodes roleId;
    @NotNull
    @Size(max = 15)
    private EDealerReg dealerId;
    private boolean isActive;
}

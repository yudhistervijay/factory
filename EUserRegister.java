package com.factory.appraisal.vehiclesearchapp.persistence.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "USER_REG")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "USER_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EUserRegister extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "APT_NUMBER")
    private String apartmentNumber;
    private String city;
    private String email;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    private String password;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    private String state;
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "ZIP_CODE")
    private String zipCode;

    @ManyToOne(targetEntity = EConfigCodes.class, fetch = FetchType.LAZY)
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @JoinColumn(name = "role_id_id", nullable = false)
    @Column(name = "ROLE_ID")
    private EConfigCodes roleId;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @ManyToOne(targetEntity = EDealerReg.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "dealer_id_id",nullable = false)
    @Column(name = "DEALER_ID")
    private EDealerReg dealerId;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;

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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

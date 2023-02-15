package com.factory.appraisal.vehiclesearchapp.persistence.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "VEH_D_WARN_LIGHT_STATUS")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "WL_STATUS_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EVehicleDrivingWarnLightStatus extends TransactionEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "WL_STATUS_ID")
    private Long id;


    @Column(name = "APR_STATUS_ID")
    private EAppraisalTestDrivingStatus appraiseStatusId;
    @Column(name = "NO_FAULTS")
    private boolean noFaults;
    @Column(name = "ABS_LIGHT")
    private boolean absLight;
    @Column(name = "AIRBAG_FAULT")
    private boolean airBagFault;
    @Column(name = "BATTERY_FAULT")
    private boolean batteryFault;
    @Column(name = "BRAKE_SYSTEM")
    private boolean brakeSystem;
    @Column(name = "BRAKE_PAD_WEAR")
    private boolean brakePadWear;
    @Column(name = "CHARGING_SYS")
    private boolean chargingSystem;
    @Column(name = "COOLANT_LEVEL")
    private boolean coolantLevel;
    @Column(name = "COOLANT_TEMP")
    private boolean coolantTemp;
    @Column(name = "CHECK_ENG_LIGHT")
    private boolean checkEngineLight;
    @Column(name = "OIL_PRESSURE")
    private boolean oilPressure;
    @Column(name = "SERVICE_ENG_SOON")
    private boolean serviceEngineSoon;
    @Column(name = "STEERING_FAULTS")
    private boolean steeringFaults;
    @Column(name = "SUSPENSION_SYSTEM")
    private boolean suspensionSystem;
    @Column(name = "TRACTION_CONTROL")
    private boolean tractionControl;
    @Column(name = "TRANSMISSION_FAULT")
    private boolean transmissionFault;
    @Column(name = "DEF_LIGHT")
    private boolean dieselExhaustFluidLight;
    @Column(name = "DPF_LIGHT")
    private boolean dieselParticulateFilter;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EAppraisalTestDrivingStatus getAppraiseStatusId() {
        return appraiseStatusId;
    }

    public void setAppraiseStatusId(EAppraisalTestDrivingStatus appraiseStatusId) {
        this.appraiseStatusId = appraiseStatusId;
    }

    public boolean isNoFaults() {
        return noFaults;
    }

    public void setNoFaults(boolean noFaults) {
        this.noFaults = noFaults;
    }

    public boolean isAbsLight() {
        return absLight;
    }

    public void setAbsLight(boolean absLight) {
        this.absLight = absLight;
    }

    public boolean isAirBagFault() {
        return airBagFault;
    }

    public void setAirBagFault(boolean airBagFault) {
        this.airBagFault = airBagFault;
    }

    public boolean isBatteryFault() {
        return batteryFault;
    }

    public void setBatteryFault(boolean batteryFault) {
        this.batteryFault = batteryFault;
    }

    public boolean isBrakeSystem() {
        return brakeSystem;
    }

    public void setBrakeSystem(boolean brakeSystem) {
        this.brakeSystem = brakeSystem;
    }

    public boolean isBrakePadWear() {
        return brakePadWear;
    }

    public void setBrakePadWear(boolean brakePadWear) {
        this.brakePadWear = brakePadWear;
    }

    public boolean isChargingSystem() {
        return chargingSystem;
    }

    public void setChargingSystem(boolean chargingSystem) {
        this.chargingSystem = chargingSystem;
    }

    public boolean isCoolantLevel() {
        return coolantLevel;
    }

    public void setCoolantLevel(boolean coolantLevel) {
        this.coolantLevel = coolantLevel;
    }

    public boolean isCoolantTemp() {
        return coolantTemp;
    }

    public void setCoolantTemp(boolean coolantTemp) {
        this.coolantTemp = coolantTemp;
    }

    public boolean isCheckEngineLight() {
        return checkEngineLight;
    }

    public void setCheckEngineLight(boolean checkEngineLight) {
        this.checkEngineLight = checkEngineLight;
    }

    public boolean isOilPressure() {
        return oilPressure;
    }

    public void setOilPressure(boolean oilPressure) {
        this.oilPressure = oilPressure;
    }

    public boolean isServiceEngineSoon() {
        return serviceEngineSoon;
    }

    public void setServiceEngineSoon(boolean serviceEngineSoon) {
        this.serviceEngineSoon = serviceEngineSoon;
    }

    public boolean isSteeringFaults() {
        return steeringFaults;
    }

    public void setSteeringFaults(boolean steeringFaults) {
        this.steeringFaults = steeringFaults;
    }

    public boolean isSuspensionSystem() {
        return suspensionSystem;
    }

    public void setSuspensionSystem(boolean suspensionSystem) {
        this.suspensionSystem = suspensionSystem;
    }

    public boolean isTractionControl() {
        return tractionControl;
    }

    public void setTractionControl(boolean tractionControl) {
        this.tractionControl = tractionControl;
    }

    public boolean isTransmissionFault() {
        return transmissionFault;
    }

    public void setTransmissionFault(boolean transmissionFault) {
        this.transmissionFault = transmissionFault;
    }

    public boolean isDieselExhaustFluidLight() {
        return dieselExhaustFluidLight;
    }

    public void setDieselExhaustFluidLight(boolean dieselExhaustFluidLight) {
        this.dieselExhaustFluidLight = dieselExhaustFluidLight;
    }

    public boolean isDieselParticulateFilter() {
        return dieselParticulateFilter;
    }

    public void setDieselParticulateFilter(boolean dieselParticulateFilter) {
        this.dieselParticulateFilter = dieselParticulateFilter;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

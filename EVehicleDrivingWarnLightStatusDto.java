package com.factory.appraisal.vehiclesearchapp.dto;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalTestDrivingStatus;
import com.sun.istack.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EVehicleDrivingWarnLightStatusDto {
    @NotNull
    @Size(max = 15)
    private Long id;
    @NotNull
    @Size(max = 15)
    private EAppraisalTestDrivingStatus appraiseStatusId;
    @NotNull
    private boolean noFaults;

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

    @NotNull
    private boolean absLight;
    @NotNull
    private boolean airBagFault;
    @NotNull
    private boolean batteryFault;
    @NotNull
    private boolean brakeSystem;
    @NotNull
    private boolean brakePadWear;
    @NotNull
    private boolean chargingSystem;
    @NotNull
    private boolean coolantLevel;
    @NotNull
    private boolean coolantTemp;
    @NotNull
    private boolean checkEngineLight;
    @NotNull
    private boolean oilPressure;
    @NotNull
    private boolean serviceEngineSoon;
    @NotNull
    private boolean steeringFaults;
    @NotNull
    private boolean suspensionSystem;
    @NotNull
    private boolean tractionControl;
    @NotNull
    private boolean transmissionFault;
    @NotNull
    private boolean dieselExhaustFluidLight;
    @NotNull
    private boolean dieselParticulateFilter;
    @NotNull
    private boolean isActive;
}

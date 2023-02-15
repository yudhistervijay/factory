package com.factory.appraisal.vehiclesearchapp.dto;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraiseVehicle;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;

import javax.validation.constraints.Size;

@AllArgsConstructor(staticName = "build")
public class ESignDetDto {
    @NotNull
    @Size(max = 15)
    private Long id;
    @NotNull
    @Size(max = 17)
    private String signDocument;
    @NotNull
    @Size(max = 15)
    private EAppraiseVehicle appraisalReferenceId;
    private boolean isActive;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSignDocument() {
        return signDocument;
    }

    public void setSignDocument(String signDocument) {
        this.signDocument = signDocument;
    }

    public EAppraiseVehicle getAppraisalReferenceId() {
        return appraisalReferenceId;
    }

    public void setAppraisalReferenceId(EAppraiseVehicle appraisalReferenceId) {
        this.appraisalReferenceId = appraisalReferenceId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

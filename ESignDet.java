package com.factory.appraisal.vehiclesearchapp.persistence.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@Entity
@Table(name = "E_SIGN_DET")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "id", column = @Column(name = "E_SIGN_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class ESignDet extends TransactionEntity{

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name="E_SIGN_ID")
    private Long id;
    @Column(name = "E_SIGN_DOC")
    private String signDocument;

    @ManyToOne(targetEntity = EAppraiseVehicle.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "appraisal_reference_id_id",nullable = false)
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private EAppraiseVehicle appraisalReferenceId;
    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    public EAppraiseVehicle getAppraisalReferenceId() {
        return appraisalReferenceId;
    }

    public void setAppraisalReferenceId(EAppraiseVehicle appraisalReferenceId) {
        this.appraisalReferenceId = appraisalReferenceId;
    }

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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

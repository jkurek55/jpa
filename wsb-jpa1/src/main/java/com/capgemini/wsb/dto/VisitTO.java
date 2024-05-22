package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO {

    private Long id;

    private String description;

    private LocalDateTime time;

    private DoctorEntity doctorEntity;

    private PatientEntity patientEntity;

    List<MedicalTreatmentEntity> medicalTreatmentEntityList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public PatientEntity getPatientEntity() {
        return patientEntity;
    }

    public void setPatientEntity(PatientEntity patientEntity) {
        this.patientEntity = patientEntity;
    }

    public DoctorEntity getDoctorEntity() {
        return doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity) {
        this.doctorEntity = doctorEntity;
    }

    public List<MedicalTreatmentEntity> getMedicalTreatmentEntityList() {return medicalTreatmentEntityList;}

    public void setMedicalTreatmentEntityList(List<MedicalTreatmentEntity> medicalTreatmentEntityList) {this.medicalTreatmentEntityList = medicalTreatmentEntityList;}

}

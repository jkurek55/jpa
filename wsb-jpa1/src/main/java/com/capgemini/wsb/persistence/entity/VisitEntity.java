package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;




	@ManyToOne(optional = false)
	@JoinColumn(name = "doctor_id")
	private DoctorEntity doctorEntity;

	@ManyToOne(optional = false)
	@JoinColumn(name = "patient_id")
	private PatientEntity patientEntity;

	@OneToMany(mappedBy = "visitEntity", cascade = CascadeType.ALL)
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

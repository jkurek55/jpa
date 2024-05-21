package com.capgemini.wsb.persistence.entity;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	private String email;

	private Boolean regularCustomer;

	@Column(nullable = false)
	private String patientNumber;

	@Column(nullable = false)
	private LocalDate dateOfBirth;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressEntity addressEntity;

	@OneToMany(mappedBy = "patientEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<VisitEntity> visitEntityList;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getRegularCustomer() {
		return regularCustomer;
	}

	public void setRegularCustomer(Boolean regularCustomer) {
		this.regularCustomer = regularCustomer;
	}


	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<VisitEntity> getVisitEntityList() {
		return visitEntityList;
	}

	public void setVisitEntityList(List<VisitEntity> visitEntityList) {
		this.visitEntityList = visitEntityList;
	}


}

package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao
{


    @Override
    public List<PatientEntity> findPatientByLastName(String lastName) {
        TypedQuery<PatientEntity> query = entityManager.createQuery("SELECT patient FROM PatientEntity patient WHERE patient.lastName LIKE :lastName", PatientEntity.class).setParameter("lastName", lastName);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsWithMoreVisitsThan(int numberOfVisits) {
        TypedQuery<PatientEntity> query = entityManager.createQuery("SELECT patient FROM PatientEntity patient WHERE size(patient.visitEntityList) > :numberOfVisits", PatientEntity.class).setParameter("numberOfVisits", numberOfVisits);
        return query.getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsWithGmail() {
        TypedQuery<PatientEntity> query = entityManager.createQuery(
                "SELECT patient FROM PatientEntity patient WHERE patient.email LIKE '%gmail%'",
                PatientEntity.class
        );
        return query.getResultList();
    }
}

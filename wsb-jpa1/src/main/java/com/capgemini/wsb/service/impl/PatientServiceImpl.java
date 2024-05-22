package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.mapper.PatientMapper;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientServiceImpl implements PatientService
{
    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao pPatientDao)
    {
        patientDao = pPatientDao;
    }

    @Override
    public PatientTO findById(long id) {
        final PatientEntity patientEntity = patientDao.findOne(id);
        PatientTO patientTo = PatientMapper.mapToTO(patientEntity);
        return patientTo;
    }

    @Override
    public long deleteById(long id) {
        patientDao.delete(id);
        return id;
    }

    @Override
    public List<VisitEntity> getPatientVisitList(long id)
    {
        return patientDao.findOne(id).getVisitEntityList();
    }
}
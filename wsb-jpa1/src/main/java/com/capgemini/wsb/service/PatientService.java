package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.List;

public interface PatientService
{
    public PatientTO findById(final long id);

    long deleteById(long id);

    List<VisitEntity> getPatientVisitList(long id);
}

package com.capgemini.wsb.persistance.service;

import com.capgemini.wsb.dto.PatientTO;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.service.PatientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorEntity doctorEntity;

    //Lab2 test 1 i Lab3 test 2
    @Test
    public void ShouldReturnPatientVisitList(){

        PatientTO patientTO = patientService.findById(2);
        //zwrocenie wszystkich wizyt po ID pacienta
        assertEquals(patientTO.getVisitEntityList().size(),2);
    }



    @Test void shouldDeletePatient(){
        patientService.deleteById(1);
        assertNull(patientService.findById(1));
    }





}

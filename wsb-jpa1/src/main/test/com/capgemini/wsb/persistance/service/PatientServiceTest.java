package com.capgemini.wsb.persistance.service;

import com.capgemini.wsb.dto.PatientTO;

import com.capgemini.wsb.service.DoctorService;
import com.capgemini.wsb.service.PatientService;
import com.capgemini.wsb.service.VisitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
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
    private DoctorService doctorService;
    @Autowired
    private VisitService visitService;

    @Test
    public void ShouldReturnPatientVisitList()
    {
        //sprawdzenie czy liczba wizyt się zgadza z pacjentem o danym ID
        assertEquals(2,patientService.getPatientVisitList(2).size());

    }

    @Test
    public void shouldDeletePatientAndVisitsNotDoctors(){
        //given: data.sql
        //when
        patientService.deleteById(1L);
        //then
        assertNull(patientService.findById(1L));
       assertNull(visitService.findById(1L));
       assertNotNull(doctorService.findById(1L));

    }





}

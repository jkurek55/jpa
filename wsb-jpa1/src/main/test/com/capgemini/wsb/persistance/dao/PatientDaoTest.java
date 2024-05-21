package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.AddressDao;
import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.AddressEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)

@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;


    @Transactional
    @Test
    public void testShouldFindPatientByName() {
        // given
        // when
        PatientEntity patientEntity = null;
        //PatientEntity patientEntity = patientDao.findAll();
        List<PatientEntity> patientEntityList = patientDao.findAll();
        for (int i = 0; i < patientEntityList.size(); i++) {
            System.out.println(patientEntityList.get(i));
            if (patientEntityList.get(i).getFirstName().equals("jurek"))
            {
                patientEntity = patientEntityList.get(i);
            }
        }
        assertThat(patientEntity).isNotNull();
        assertEquals(patientEntity.getId(), 2);
    }

    @Test
    public void testShouldFindPatientsThatHaveMoreVisitsThan1()
    {
        int visitQuantity = 1;
        List<PatientEntity> patientsThatHaveMoreThanOneVisit = new ArrayList<>();

        List<PatientEntity> patientEntityList = patientDao.findAll();

        for (int i = 0; i < patientEntityList.size(); i++)
        {
            if (patientEntityList.get(i).getVisitEntityList().size() > visitQuantity)
            {
                patientsThatHaveMoreThanOneVisit.add(patientEntityList.get(i));
            }
        }
        //wielkosc listy ktora zbiera pacjentow ma sie rownac 4 bo tyle jest pacjentow z wieksza liczba wizyt niz 1
        assertEquals(4, patientsThatHaveMoreThanOneVisit.size());


    }


    @Test
    public void testShouldFindPatientsThatHaveGmail()
    {
        List<PatientEntity> patientsThatHaveGmail = new ArrayList<>();

        List<PatientEntity> patientEntityList = patientDao.findAll();

        for (int i = 0; i < patientEntityList.size(); i++)
        {
            if (patientEntityList.get(i).getEmail().contains("@gmail.com"))
            {
                patientsThatHaveGmail.add(patientEntityList.get(i));
            }
        }
    assertEquals(3, patientsThatHaveGmail.size());
    }



}

package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.DoctorTO;
import org.springframework.stereotype.Service;

public interface DoctorService {
    public DoctorTO findById(final long id);
}

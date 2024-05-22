package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.VisitTO;
import org.springframework.stereotype.Service;

public interface VisitService {
    public VisitTO findById(final long id);
}

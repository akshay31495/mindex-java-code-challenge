package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.ResultCompensation;

public interface CompensationService {

    ResultCompensation add(Compensation employeeCompensation);

    ResultCompensation get(String employeeId);
    
}

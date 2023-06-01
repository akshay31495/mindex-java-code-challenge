package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.ResultCompensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);

    @Autowired
    private CompensationService compensationService;

    
    /** 
     * @param employeeCompensation
     * @return ResultCompensation
     */
    @PostMapping("/compensation")
    private ResultCompensation createCompensation(@RequestBody Compensation employeeCompensation){
        LOG.debug("Received compensation create request for employee id [{}]", employeeCompensation.getEmployeeId());
        // Receive the employeeId, salary, and effectiveDate from the user in the form of JSON in the request body of POST
        return compensationService.add(employeeCompensation);
    }

    
    /** 
     * @param id
     * @return ResultCompensation
     */
    @GetMapping("/compensation/{id}")
    private ResultCompensation getCompensation(@PathVariable String id){
        LOG.debug("Received compensation access request for employee id [{}]", id);
        // return the compensation object from the service class
        return compensationService.get(id);
    }
}

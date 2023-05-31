package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ResultCompensation;
import com.mindex.challenge.exception.CompensationException;
import com.mindex.challenge.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensationServiceImpl implements CompensationService {

    @Autowired
    private CompensationRepository compensationRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     *
     * @param compensationInput the JSON provided for the creating a compensation for an employee
     * @return compensation object (success acknowledgement)
     */
    @Override
    public ResultCompensation add(Compensation compensationInput) {
        Employee emp = employeeRepository.findByEmployeeId(compensationInput.getEmployeeId()); // find the employee from the given employee id
        if(emp == null){
            throw new CompensationException("No such employee id in the database");
        }
        // create the compensation object from the input to store in the database
        ResultCompensation compensation = new ResultCompensation();
        compensation.setEmployee(emp);
        compensation.setSalary(compensationInput.getSalary());
        compensation.setEffectiveDate(compensationInput.getEffectiveDate());
        compensationRepository.insert(compensation); // do the actual insert into the database
        return compensation;
    }

    /**
     * Find the compensation for the employee by ID
     * @param employeeId the employeeId for which compensation is retrieved 
     * @return Compensation object
     */
    @Override
    public ResultCompensation get(String employeeId) {
        Employee emp = employeeRepository.findByEmployeeId(employeeId); // find the employee from the given employee id
        if(emp == null){
            throw new CompensationException("No such employee id in the database");
        }
        return compensationRepository.findByEmployee(emp); // find the compensation from the particular employee
    }
}

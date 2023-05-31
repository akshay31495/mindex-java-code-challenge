package com.mindex.challenge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.exception.ReportingException;
import com.mindex.challenge.service.ReportingStructureService;


@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

    @Autowired
    private EmployeeRepository employeeRepository;

    
    /** 
     * @param employeeId
     * @return ReportingStructure
     */
    @Override
    public ReportingStructure getReportingStructure(String employeeId) {
        Employee employee = employeeRepository.findByEmployeeId(employeeId);

        if (employee == null) {
            throw new ReportingException("Employee not found for employeeID: " + employeeId);
        }

        ReportingStructure rs = new ReportingStructure();
        rs.setEmployee(employee);
        rs.setNumberOfReports(calculateNumberOfDirectReports(employee));
        return rs;
    }

    
    /** 
     * @param employee
     * @return int
     */
    private int calculateNumberOfDirectReports(Employee employee) {
        int numberOfReports = 0;
        List<Employee> reports = employee.getDirectReports();

        if(reports == null){
         return 0;
        }

        for(Employee e : reports){
            Employee empObject = employeeRepository.findByEmployeeId(e.getEmployeeId());
            numberOfReports+= calculateNumberOfDirectReports(empObject);
        }

        return numberOfReports + reports.size();
    }
    
}

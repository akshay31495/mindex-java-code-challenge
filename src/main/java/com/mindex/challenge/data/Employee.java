package com.mindex.challenge.data;

import java.util.List;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private List<Employee> directReports;

    public Employee() {
    }

    
    /** 
     * @return String
     */
    public String getEmployeeId() {
        return employeeId;
    }

    
    /** 
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    
    /** 
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    
    /** 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    /** 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    
    /** 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    /** 
     * @return String
     */
    public String getPosition() {
        return position;
    }

    
    /** 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    
    /** 
     * @return String
     */
    public String getDepartment() {
        return department;
    }

    
    /** 
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    
    /** 
     * @return List<Employee>
     */
    public List<Employee> getDirectReports() {
        return directReports;
    }

    
    /** 
     * @param directReports
     */
    public void setDirectReports(List<Employee> directReports) {
        this.directReports = directReports;
    }
}

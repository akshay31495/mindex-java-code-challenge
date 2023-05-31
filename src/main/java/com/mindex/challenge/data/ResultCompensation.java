package com.mindex.challenge.data;

public class ResultCompensation {

    private Employee employee;
    private float salary;
    private String effectiveDate;

    
    /** 
     * @return Employee
     */
    public Employee getEmployee() {
        return employee;
    }

    
    /** 
     * @param employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    /** 
     * @param salary
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    
    /** 
     * @param effectiveDate
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    /** 
     * @return float
     */
    public float getSalary() {
        return salary;
    }

    
    /** 
     * @return String
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }
    
}

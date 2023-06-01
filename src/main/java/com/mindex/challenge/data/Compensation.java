package com.mindex.challenge.data;

import javax.validation.constraints.Min;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Compensation {


    @Min(value=0,message="employeeId should be a positive number")
    private String employeeId;
    @Min(value=0,message="salary should be a positive number")
    private float salary;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private String effectiveDate;

    public Compensation() {
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
        public String getEmployeeId() {
            return this.employeeId;
        }
        
        
        /** 
         * @param salary
         */
        public void setSalary(float salary) {
            this.salary = salary;
        }

        
        /** 
         * @return float
         */
        public float getSalary() {
            return this.salary;
        }
        
        
        /** 
         * @param effectiveDate
         */
        public void setEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        
        /** 
         * @return String
         */
        public String getEffectiveDate() {
            return this.effectiveDate;
        }
           

    
}

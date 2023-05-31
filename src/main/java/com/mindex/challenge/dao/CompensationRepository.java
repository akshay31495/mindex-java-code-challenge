package com.mindex.challenge.dao;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ResultCompensation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompensationRepository extends MongoRepository<ResultCompensation, String> {
    ResultCompensation findByEmployee(Employee employee);
}
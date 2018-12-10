package com.tcs.acc.employeedata.repository;

import com.tcs.acc.employeedata.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.String;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
       @Override
    	default Optional<Employee> findById(String id) {
    		// TODO Auto-generated method stub
    		return null;
    	}
    
   
    @Override
    void delete(Employee deleted);
    
    
}
package com.dataProject.dataProject.repository;

import com.dataProject.dataProject.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> { // class table , PK data type


}

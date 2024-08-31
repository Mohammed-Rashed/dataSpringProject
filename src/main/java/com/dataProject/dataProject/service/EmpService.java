package com.dataProject.dataProject.service;

import com.dataProject.dataProject.model.entity.Employee;
import com.dataProject.dataProject.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;


//    public Optional<Employee> getEmployeeById(int id) {
//        return this.empRepo.findById(1);
//    }
    public Employee getEmployeeById(int id) {
        Optional<Employee> emp= this.empRepo.findById(id);
        return emp.orElse(new Employee());
    }
    public Employee save(Employee employee) {
        return this.empRepo.save(employee);
    }
    public void delete(Integer id) {
         this.empRepo.deleteById(id);
    }

}

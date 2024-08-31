package com.dataProject.dataProject.controller;

import com.dataProject.dataProject.model.entity.Employee;
import com.dataProject.dataProject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @GetMapping("/find")
    public Employee getUser(@RequestParam Integer id){
        return empService.getEmployeeById(id);
    }
}

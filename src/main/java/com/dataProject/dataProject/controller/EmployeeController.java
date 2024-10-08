package com.dataProject.dataProject.controller;

import com.dataProject.dataProject.model.entity.Employee;
import com.dataProject.dataProject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmpService empService;

    @GetMapping("/find")
    public Employee find(@RequestParam Integer id){
        return empService.getEmployeeById(id);
    }
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return empService.save(employee);
    }
    @PostMapping("/update")
    public Employee update(@RequestBody Employee employee){ // diff with store is provide id in request body and jpa update record if found the row with id
        return empService.save(employee);
    }
    @GetMapping("/delete")
    public void save(@RequestParam Integer id){
         empService.delete(id);
    }
}

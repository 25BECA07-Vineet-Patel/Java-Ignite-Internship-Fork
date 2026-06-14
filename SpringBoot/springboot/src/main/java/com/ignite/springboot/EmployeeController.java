package com.ignite.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(null);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id,
            @RequestBody Employee employee) {

        Employee existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(employee.getName());
            existing.setDepartment(employee.getDepartment());
            existing.setSalary(employee.getSalary());

            return repository.save(existing);
        }

        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        repository.deleteById(id);

        return "Employee Deleted Successfully";
    }
}
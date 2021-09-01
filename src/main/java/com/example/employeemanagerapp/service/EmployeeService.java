package com.example.employeemanagerapp.service;

import com.example.employeemanagerapp.exception.UserNotFoundException;
import com.example.employeemanagerapp.model.Employee;
import com.example.employeemanagerapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException());
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }


}

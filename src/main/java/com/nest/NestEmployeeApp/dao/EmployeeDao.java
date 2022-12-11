package com.nest.NestEmployeeApp.dao;

import com.nest.NestEmployeeApp.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
}

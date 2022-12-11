package com.nest.NestEmployeeApp.dao;

import com.nest.NestEmployeeApp.model.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {

    @Query(value = "SELECT `id`, `designation`, `email`, `empcode`, `name`, `phoneno`, `salary` FROM `employee` WHERE `empcode`= :empcode AND `email`= :email",nativeQuery = true)
    List<Employees> EmployeeLogin(@Param("empcode")int empcode,@Param("email")String email);
}


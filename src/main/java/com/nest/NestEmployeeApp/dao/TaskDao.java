package com.nest.NestEmployeeApp.dao;

import com.nest.NestEmployeeApp.model.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Tasks,Integer> {
}

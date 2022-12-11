package com.nest.NestEmployeeApp.controller;

import com.nest.NestEmployeeApp.dao.EmployeeDao;
import com.nest.NestEmployeeApp.dao.TaskDao;
import com.nest.NestEmployeeApp.model.Employees;
import com.nest.NestEmployeeApp.model.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @Autowired
    private TaskDao tdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> addEmployee(@RequestBody Employees e){
        dao.save(e);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addtask",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> addTask(@RequestBody Tasks t){
        tdao.save(t);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewtask")
    public List<Tasks> viewTask(){
        return (List<Tasks>)tdao.findAll();
    }
}

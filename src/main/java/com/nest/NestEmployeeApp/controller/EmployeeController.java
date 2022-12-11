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
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> employeeLogin(@RequestBody Employees e){
        int empcode=e.getEmpcode();
        String email=e.getEmail().toString();
        List<Employees> result=(List<Employees>) dao.EmployeeLogin(e.getEmpcode(),e.getEmail());
        HashMap<String,String>map=new HashMap<>();
        if(result.size()==0) {
            map.put("status", "failed");
        }
        else{
            int id = result.get(0).getId();
            map.put("userid",String.valueOf(id));
            map.put("status", "success");
        }
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewtask")
    public List<Tasks> viewTask(){
        return (List<Tasks>)tdao.findAll();
    }
}

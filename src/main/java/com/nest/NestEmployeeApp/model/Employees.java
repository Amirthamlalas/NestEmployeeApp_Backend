package com.nest.NestEmployeeApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employees {

    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;
    private String designation;
    private String salary;
    private String email;
    private String phoneno;

    public Employees() {
    }

    public Employees(int id, int empcode, String name, String designation, String salary, String email, String phoneno) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.email = email;
        this.phoneno = phoneno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}

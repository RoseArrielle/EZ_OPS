package com.example.EZ_OPS.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Employee {
    private int employee_id;
    private String firstName;
    private String lastName;
    private String job_title;
    private BigDecimal salary;
    private LocalDateTime hire_date;
    private String department;
    private String address;
    private String email;

    public Employee(int employee_id, String firstName, String lastName, String job_title, BigDecimal salary, LocalDateTime hire_date, String department, String address, String email) {
        this.employee_id = employee_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.job_title = job_title;
        this.salary = salary;
        this.hire_date = hire_date;
        this.department = department;
        this.address = address;
        this.email = email;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDateTime getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDateTime hire_date) {
        this.hire_date = hire_date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

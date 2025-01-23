package com.booleanuk.api.employee;


public class Employee {
    private Integer id;
    String name;
    String jobName;
    String salaryGrade;
    String department;

    public Employee(int id, String name, String jobName, String salaryGrade, String department){
        this.id = id;
        this.name = name;
        this.jobName = jobName;
        this.salaryGrade = salaryGrade;
        this.department = department;
    }
    public Employee(String name, String jobName, String salaryGrade, String department){
        this.name = name;
        this.jobName = jobName;
        this.salaryGrade = salaryGrade;
        this.department = department;
    }

    public Employee(){}

    public Employee(int id){
        this.id = id;
    }

    public String toString(){
        String result = "";
        result += this.id + " - ";
        result += this.name  + " - ";
        result += this.jobName  + " - ";
        result += this.salaryGrade  + " - ";
        result += this.department;

        return result;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(String salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

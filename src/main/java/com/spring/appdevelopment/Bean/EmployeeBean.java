package com.spring.appdevelopment.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName="Vivek Kumar Sahu";
    public String getEmployeeName(){
        return employeeName;
    }

    @Autowired
    DepartmentBean departmentBean;

    public void showEmployeeDetails(){
        System.out.println("Employee Name is: " + getEmployeeName());
        System.out.println("Department name is: "+ departmentBean.getDepartmentName());
    }

}

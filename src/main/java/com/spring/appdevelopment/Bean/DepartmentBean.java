package com.spring.appdevelopment.Bean;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    public String departmentName = "Software Department";
    public String getDepartmentName(){
        return departmentName;
    }

}

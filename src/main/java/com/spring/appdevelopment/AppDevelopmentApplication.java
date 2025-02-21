package com.spring.appdevelopment;

import com.spring.appdevelopment.Bean.EmployeeBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.appdevelopment.Bean")
public class AppDevelopmentApplication implements CommandLineRunner {

	private final ApplicationContext applicationContext;

	public AppDevelopmentApplication(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppDevelopmentApplication.class, args);
	}

	@Override
	public void run(String... args) {
		EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);
		employeeBean.showEmployeeDetails();
	}
}

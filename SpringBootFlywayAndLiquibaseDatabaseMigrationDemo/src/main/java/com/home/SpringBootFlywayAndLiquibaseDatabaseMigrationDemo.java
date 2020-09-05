package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.dao.EmployeeDao;
import com.home.model.Employee;

@SpringBootApplication
public class SpringBootFlywayAndLiquibaseDatabaseMigrationDemo implements CommandLineRunner{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayAndLiquibaseDatabaseMigrationDemo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
	}

	private void createEmployee() {
		Employee  employee=new Employee();
		employee.setEmpName("Shubham");
		employee.setEmail("s@gmail.com");
		employee.setSalary(15000.0);
		employeeDao.save(employee);
	}

}

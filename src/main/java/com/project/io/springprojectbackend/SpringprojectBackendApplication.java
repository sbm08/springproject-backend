package com.project.io.springprojectbackend;

import com.project.io.springprojectbackend.model.Employee;
import com.project.io.springprojectbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringprojectBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee();
//		employee.setFirstName("Subam");
//		employee.setLastName("Sarkar");
//		employee.setEmailId("subham.sarkar08@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Sourav");
//		employee1.setLastName("Roy");
//		employee1.setEmailId("sourav.roy@gmail.com");
//		employeeRepository.save(employee1);

	}
}

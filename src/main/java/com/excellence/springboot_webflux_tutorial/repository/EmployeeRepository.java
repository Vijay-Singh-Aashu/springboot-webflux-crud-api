package com.excellence.springboot_webflux_tutorial.repository;

import com.excellence.springboot_webflux_tutorial.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}

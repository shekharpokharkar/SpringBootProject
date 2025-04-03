package com.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

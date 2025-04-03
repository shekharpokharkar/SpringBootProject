package com.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

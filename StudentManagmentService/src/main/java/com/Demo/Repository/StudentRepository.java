package com.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

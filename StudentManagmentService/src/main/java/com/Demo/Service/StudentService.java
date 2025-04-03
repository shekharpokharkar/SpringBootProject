package com.Demo.Service;

import java.util.List;

import com.Demo.DTO.StudentDTO;

public interface StudentService {

	public StudentDTO saveStudent(StudentDTO dtO);

	public StudentDTO getStudentById(Integer studentId);

	public List<StudentDTO> getAllStudent();

	public StudentDTO updateStudent(Integer studentId, StudentDTO dtO);

	public String deleteStudentById(Integer studentId);

}

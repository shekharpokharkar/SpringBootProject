package com.Demo.Utils;

import org.springframework.beans.BeanUtils;

import com.Demo.DTO.StudentDTO;
import com.Demo.Entity.Student;

public interface StudentUtils {

	public static StudentDTO map(Student student) {
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(student, dto);
		return dto;

	}

	public static Student map(StudentDTO dto) {
		Student student = new Student();
		BeanUtils.copyProperties(dto, student);
		return student;

	}
}

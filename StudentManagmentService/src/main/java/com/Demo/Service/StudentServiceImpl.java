package com.Demo.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.DTO.StudentDTO;
import com.Demo.Entity.Student;
import com.Demo.Repository.StudentRepository;
import com.Demo.Utils.StudentUtils;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentDTO saveStudent(StudentDTO dtO) {

		Student map = StudentUtils.map(dtO);
		return StudentUtils.map(repository.save(StudentUtils.map(dtO)));

	}

	@Override
	public StudentDTO getStudentById(Integer studentId) {

		return repository.findById(studentId).map(StudentUtils::map)
				.orElseThrow(() -> new RuntimeException("Student Not Found"));

	}

	@Override
	public List<StudentDTO> getAllStudent() {

		return repository.findAll().stream().map(StudentUtils::map).toList();

	}

	@Override
	public StudentDTO updateStudent(Integer studentId, StudentDTO dtO) {

		Student student = repository.findById(studentId).orElseThrow(() -> new RuntimeException("Student Not Found"));

		BeanUtils.copyProperties(dtO, student);

		student.setStudentId(studentId);

		Student save = repository.save(student);

		return StudentUtils.map(student);

	}

	@Override
	public String deleteStudentById(Integer studentId) {

		Student student = repository.findById(studentId).orElseThrow(() -> new RuntimeException("Student Not Found"));

		repository.delete(student);

		return "student deleted Successfully";
	}

}

package com.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.DTO.StudentDTO;
import com.Demo.Service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/")
	public ResponseEntity<StudentDTO> saveStudent(@RequestBody StudentDTO studentDTO) {
		StudentDTO studentDTO2 = studentService.saveStudent(studentDTO);

		return new ResponseEntity<StudentDTO>(studentDTO2, HttpStatus.CREATED);

	}

	@GetMapping("/")
	public ResponseEntity<List<StudentDTO>> getAllStudent() {
		List<StudentDTO> allStudent = studentService.getAllStudent();

		return new ResponseEntity<List<StudentDTO>>(allStudent, HttpStatus.OK);

	}

	@GetMapping("/{studentID}")
	public ResponseEntity<StudentDTO> saveStudent(@PathVariable("studentID") Integer studentId) {
		StudentDTO studentDTO2 = studentService.getStudentById(studentId);

		return new ResponseEntity<StudentDTO>(studentDTO2, HttpStatus.OK);

	}

	@PutMapping("/{studentID}")
	public ResponseEntity<StudentDTO> saveStudent(@PathVariable("studentID") Integer studentId,
			@RequestBody StudentDTO studentDTO) {
		StudentDTO studentDTO2 = studentService.updateStudent(studentId, studentDTO);

		return new ResponseEntity<StudentDTO>(studentDTO2, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/{studentID}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentID") Integer studentId) {
		String deleteStudentById = studentService.deleteStudentById(studentId);

		return new ResponseEntity<String>(deleteStudentById, HttpStatus.OK);
		// return new ResponseEntity<String>(deleteStudentById, HttpStatus.NO_CONTENT);

	}

}

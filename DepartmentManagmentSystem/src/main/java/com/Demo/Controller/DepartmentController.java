package com.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.DTO.DepartmentDTO;
import com.Demo.Service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	public DepartmentService service;

	@GetMapping("/")
	public ResponseEntity<List<DepartmentDTO>> getAllDepartment() {

		List<DepartmentDTO> allDepartment = service.getAllDepartment();

		allDepartment.stream().forEach(System.out::println);

		return new ResponseEntity<List<DepartmentDTO>>(allDepartment, HttpStatus.OK);
	}

	@GetMapping("/{DepartmentID}")
	public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable("DepartmentID") Integer department) {

		DepartmentDTO departmentById = service.getDepartmentById(department);
		System.out.println(departmentById);

		return new ResponseEntity<DepartmentDTO>(departmentById, HttpStatus.OK);
	}
}

package com.Demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Demo.DTO.DepartmentDTO;

@RestController
public class TestClinet {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/department")
	public ResponseEntity<List<DepartmentDTO>> getAllDepartment() {

		final String url = "http://localhost:8080/api/department/";

		DepartmentDTO[] forObject = restTemplate.getForObject(url, DepartmentDTO[].class);

		List<DepartmentDTO> asList = Arrays.asList(forObject);

		asList.stream().forEach(s -> System.out.println(s));

		return new ResponseEntity<List<DepartmentDTO>>(asList, HttpStatus.OK);
	}

}

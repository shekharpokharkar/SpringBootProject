package com.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.DTO.DepartmentDTO;
import com.Demo.Repository.DepartmentRepository;
import com.Demo.Utils.DepartmentUtils;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	@Override
	public List<DepartmentDTO> getAllDepartment() {

		return repository.findAll().stream().map(DepartmentUtils::map).toList();

	}

	@Override
	public DepartmentDTO getDepartmentById(Integer departmentId) {

		return repository.findById(departmentId).map(DepartmentUtils::map)
				.orElseThrow(() -> new RuntimeException("Department Id is not present"));

	}

}

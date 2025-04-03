package com.Demo.Service;

import java.util.List;

import com.Demo.DTO.DepartmentDTO;

public interface DepartmentService {
	
	public List<DepartmentDTO> getAllDepartment();
	
	public DepartmentDTO getDepartmentById(Integer departmentId);
}

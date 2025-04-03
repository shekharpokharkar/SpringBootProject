package com.Demo.Utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.Demo.DTO.DepartmentDTO;
import com.Demo.DTO.EmployeeDTO;
import com.Demo.Entity.Department;
import com.Demo.Entity.Employee;

public interface DepartmentUtils {

	public static Department map(DepartmentDTO dto) {

		Department department = new Department();
		BeanUtils.copyProperties(dto, department);

		if (dto.getEmployees() != null) {
			List<EmployeeDTO> employees = dto.getEmployees();

			List<Employee> empList = new ArrayList<>();

			for (EmployeeDTO emp : employees) {
				Employee e1 = new Employee();
				BeanUtils.copyProperties(emp, e1);
				e1.setDepartment(department);
				empList.add(e1);
			}
		}

		return department;
	}

	public static DepartmentDTO map(Department department) {

		DepartmentDTO dto = new DepartmentDTO();

		BeanUtils.copyProperties(department, dto);

		if (department.getEmployees() != null) {
			List<EmployeeDTO> empList = new ArrayList<>();

			List<Employee> employees = department.getEmployees();

			for (Employee e1 : employees) {
				EmployeeDTO dto1 = new EmployeeDTO();
				BeanUtils.copyProperties(e1, dto1);

				empList.add(dto1);
			}
		}

		return dto;
	}

}

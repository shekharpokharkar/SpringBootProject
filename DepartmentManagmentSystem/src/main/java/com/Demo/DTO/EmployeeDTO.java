package com.Demo.DTO;

import com.Demo.Entity.Department;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

	private Integer employeeNo;
	private String employeeName;
	private Double employeeSalary;
	private Department department;
}

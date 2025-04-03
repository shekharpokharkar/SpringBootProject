package com.Demo.DTO;

import java.util.List;

import com.Demo.Entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class DepartmentDTO {

	private Integer departmentNo;
	private String departmentName;
	private String departmentLocation;

	@JsonIgnore
	private List<EmployeeDTO> employees;

}

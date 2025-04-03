package com.Demo.DTO;

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
public class StudentDTO {

	private Integer studentId;
	private String studentName;
	private String studentAddress;
	private Double studentMarks;

}

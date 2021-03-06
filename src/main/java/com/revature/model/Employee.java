package com.revature.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Employee {
	
	
	private Long id;

	
	private String code;

	
	private String name;

	
	private String password;

	
	private String gender;

	
	private Role role;

	
	private String emailId;

	
	private Long mobileNo;

	
	private boolean active;
	
	private Employee reportPerson;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate createdDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")	
private LocalDate modifiedDate;
	
	

}

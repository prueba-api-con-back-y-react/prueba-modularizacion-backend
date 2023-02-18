package com.example.demo.socios;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Socio {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(min = 1, max = 100)
	private String name;
	
	@NotBlank
	@Size
	private String lastName;
	
	@NotBlank
	@Size(min = 1, max = 100)
	@Column(unique = true)
	private String username;
	
	@Column(unique = true)
	@Email
	private String email;

}

package com.example.demo.anuncios;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Anuncios {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(min = 1, max = 100)
	private String name;

}

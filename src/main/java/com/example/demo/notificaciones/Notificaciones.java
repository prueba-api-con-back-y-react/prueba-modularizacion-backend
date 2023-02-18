package com.example.demo.notificaciones;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notificaciones {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private boolean critica;

}

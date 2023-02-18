package com.example.demo.socios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class SocioController {
	
	@Autowired
	private SocioRepository socioRepository;
	
	@PostMapping("/socio")
	Socio newSocio(@RequestBody Socio newSocio) {
		return socioRepository.save(newSocio);
	}
	
	@GetMapping("/socios")
	List<Socio> getAllSocios(){
		return socioRepository.findAll();
	}
}

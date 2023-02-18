package com.example.demo.anuncios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("http://localhost:3000")
public class AnuncioController {
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	
	@GetMapping("/anuncios")
	List<Anuncios> getAllAnuncios(){
		return anuncioRepository.findAll();
	}
	
	@PostMapping("/anuncio")
	Anuncios newUser(@RequestBody Anuncios newAnuncios) {
		return anuncioRepository.save(newAnuncios);
	}
	
}

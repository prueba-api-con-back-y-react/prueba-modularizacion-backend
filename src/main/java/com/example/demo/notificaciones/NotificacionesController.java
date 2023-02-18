package com.example.demo.notificaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class NotificacionesController {
	
	@Autowired
	private NotificacionesRepository notificacionesRepository;
	
	@PostMapping("/notificacion")
	Notificaciones newNotificaciones(@RequestBody Notificaciones newNotificaciones) {
		return notificacionesRepository.save(newNotificaciones);
	}
	
	@GetMapping("/notificaciones")
	List<Notificaciones> getAllNotificacioness(){
		return notificacionesRepository.findAll();
	}
	
}

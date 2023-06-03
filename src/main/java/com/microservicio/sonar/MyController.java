package com.microservicio.sonar;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api")
public class MyController {
	
	
	
	@GetMapping
	public String index(Model model){
		Persona persona = new Persona(1,"Juan huayhuas");
		model.addAttribute("persona", persona);
		return "listar";
	}
}


class Persona{
	private int id;
	private String nombre;
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
} 
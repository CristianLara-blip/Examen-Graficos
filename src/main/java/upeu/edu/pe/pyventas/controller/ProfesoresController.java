package upeu.edu.pe.pyventas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.pyventas.entity.Profesores;
import upeu.edu.pe.pyventas.service.ProfesoresService;

@RestController
@RequestMapping("/api/profesores")

public class ProfesoresController {

	@Autowired
	private ProfesoresService profesoresService;
	
	@GetMapping("/all")
	public List<Profesores> readAll(){		
		return profesoresService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Profesores read(@PathVariable int id){		
		return profesoresService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Profesores profesores){		
		return profesoresService.create(profesores);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Profesores profesores, @PathVariable int id) {
        return profesoresService.update(profesores, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return profesoresService.delete(id);
	}

}


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

import upeu.edu.pe.pyventas.entity.Estudiantes;
import upeu.edu.pe.pyventas.service.EstudiantesService;

@RestController
@RequestMapping("/api/estudiantes")

public class EstudiantesController {
	@Autowired
	private EstudiantesService estudiantesService;
	
	@GetMapping("/all")
	public List<Estudiantes> readAll(){		
		return estudiantesService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Estudiantes read(@PathVariable int id){		
		return estudiantesService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Estudiantes estudiantes){		
		return estudiantesService.create(estudiantes);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Estudiantes estudiantes, @PathVariable int id) {
        return estudiantesService.update(estudiantes, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return estudiantesService.delete(id);
	}

}


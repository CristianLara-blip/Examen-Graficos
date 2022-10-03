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

import upeu.edu.pe.pyventas.entity.Alumnos;
import upeu.edu.pe.pyventas.service.AlumnosService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {
	
	
	@Autowired
	private AlumnosService alumnosService;
	
	@GetMapping("/all")
	public List<Alumnos> readAll(){		
		return alumnosService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Alumnos read(@PathVariable int id){		
		return alumnosService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Alumnos alumnos){		
		return alumnosService.create(alumnos);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Alumnos alumnos, @PathVariable int id) {
        return alumnosService.update(alumnos, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return alumnosService.delete(id);
	}

}

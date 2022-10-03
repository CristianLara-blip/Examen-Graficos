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

import upeu.edu.pe.pyventas.entity.AlumInicio;
import upeu.edu.pe.pyventas.service.AlumInicioService;

@RestController
@RequestMapping("/api/aluminicio")
public class AlumInicioController {

	@Autowired
	private AlumInicioService aluminicioService;
	
	@GetMapping("/all")
	public List<AlumInicio> readAll(){		
		return aluminicioService.reaAll();
	}
	
	@GetMapping("/{id}")
	public AlumInicio read(@PathVariable int id){		
		return aluminicioService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody AlumInicio aluminicio){		
		return aluminicioService.create(aluminicio);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody AlumInicio aluminicio, @PathVariable int id) {
        return aluminicioService.update(aluminicio, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return aluminicioService.delete(id);
	}

}


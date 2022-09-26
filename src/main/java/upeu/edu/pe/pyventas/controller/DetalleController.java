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

import upeu.edu.pe.pyventas.entity.Detalle;
import upeu.edu.pe.pyventas.service.DetalleService;

@RestController
@RequestMapping("/api/detalle")
public class DetalleController {
	
	
	@Autowired
	private DetalleService detalleService;
	
	@GetMapping("/alle")
	public List<Map<String, Object>> readAll2(){		
		return detalleService.readAll2();
	}
	
	@GetMapping("/all")
	public List<Detalle> readAll(){		
		return detalleService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Detalle read(@PathVariable int id){		
		return detalleService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Detalle detalle){		
		return detalleService.create(detalle);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Detalle detalle, @PathVariable int id) {
        return detalleService.update(detalle, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return detalleService.delete(id);
	}

}

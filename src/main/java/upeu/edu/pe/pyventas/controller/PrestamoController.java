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

import upeu.edu.pe.pyventas.entity.Prestamo;
import upeu.edu.pe.pyventas.service.PrestamoService;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoController {

	@Autowired
	private PrestamoService prestamoService;
	
	@GetMapping("/alle")
	public List<Map<String, Object>> readAll2(){		
		return prestamoService.readAll2();
	}
	
	@GetMapping("/all")
	public List<Prestamo> readAll(){		
		return prestamoService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Prestamo read(@PathVariable int id){		
		return prestamoService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Prestamo prestamo){		
		return prestamoService.create(prestamo);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Prestamo prestamo, @PathVariable int id) {
        return prestamoService.update(prestamo, id) + "ok";
    }
		@DeleteMapping("/del/{id}")
		public int save(@PathVariable int id){		
			return prestamoService.delete(id);
		}
	
	
}

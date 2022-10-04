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

import upeu.edu.pe.pyventas.entity.Pais;
import upeu.edu.pe.pyventas.service.PaisService;

@RestController
@RequestMapping("/api/pais")

public class PaisController {

	@Autowired
	private PaisService paisService;
	
	@GetMapping("/all")
	public List<Pais> readAll(){		
		return paisService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Pais read(@PathVariable int id){		
		return paisService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Pais pais){		
		return paisService.create(pais);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Pais pais, @PathVariable int id) {
        return paisService.update(pais, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return paisService.delete(id);
	}

}


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

import upeu.edu.pe.pyventas.entity.Producto;
import upeu.edu.pe.pyventas.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<Producto> readAll(){		
		return productoService.reaAll();
	}
	
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id){		
		return productoService.read(id);
	}
	
	@PostMapping("/save")
	public int save(@RequestBody Producto producto){		
		return productoService.create(producto);
	}	
	
	@PutMapping("/update/{id}")
    public String update(@RequestBody Producto producto, @PathVariable int id) {
        return productoService.update(producto, id)+ "ok";
    }
	
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id){		
		return productoService.delete(id);
	}

}


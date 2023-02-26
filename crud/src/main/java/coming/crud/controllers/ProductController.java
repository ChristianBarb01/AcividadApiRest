package coming.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coming.crud.models.ProductosDTO;
import coming.crud.repository.IProductosDAO;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private IProductosDAO repository;

	@PostMapping("/product")
	public ProductosDTO create(@Validated @RequestBody ProductosDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<ProductosDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/product/{id}")
	public ProductosDTO update(@PathVariable String id, @Validated @RequestBody ProductosDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}

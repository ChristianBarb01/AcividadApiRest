package coming.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import coming.crud.models.ProductosDTO;



@Repository
public interface IProductosDAO extends MongoRepository<ProductosDTO, String> {
	
	
}

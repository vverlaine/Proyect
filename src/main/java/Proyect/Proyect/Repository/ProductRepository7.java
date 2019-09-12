package Proyect.Proyect.Repository;

import Proyect.Proyect.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository7 extends CrudRepository<Product,String> {

    @Override
    void delete(Product deleted);
}

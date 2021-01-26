package academy.digitallab.store.product.repositories;

import academy.digitallab.store.product.entities.Category;
import academy.digitallab.store.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {


    public List<Product> findByCategory(Category category);
}

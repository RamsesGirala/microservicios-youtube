package academy.digitallab.store.product.services;

import academy.digitallab.store.product.entities.Category;
import academy.digitallab.store.product.entities.Product;

import java.util.List;

public interface ProductService {

    public List<Product> listAllProduct();
    public Product getProduct(Long id);

    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);

}

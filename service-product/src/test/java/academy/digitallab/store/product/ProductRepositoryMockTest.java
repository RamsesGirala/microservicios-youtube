package academy.digitallab.store.product;

import academy.digitallab.store.product.entities.Category;
import academy.digitallab.store.product.entities.Product;
import academy.digitallab.store.product.repositories.ProductRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("Lenovo2001")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1000"))
                .status("Created")
                .createdAt(new Date())
                .build();
        productRepository.save(product01);

        List<Product> founds = productRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);
    }
}

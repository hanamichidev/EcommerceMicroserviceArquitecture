package microservice.ecommerce.store.product.repository;


import microservice.ecommerce.store.product.entity.Category;
import microservice.ecommerce.store.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}

package kodlamaio.nortwind.dataAccess.abstracts;

import kodlamaio.nortwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}

package kodlamaio.nortwind.business.abstracts;

import kodlamaio.nortwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}

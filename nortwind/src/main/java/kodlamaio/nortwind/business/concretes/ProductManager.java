package kodlamaio.nortwind.business.concretes;

import kodlamaio.nortwind.business.abstracts.ProductService;
import kodlamaio.nortwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nortwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}

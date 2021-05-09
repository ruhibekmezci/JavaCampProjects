package kodlamaio.nortwind.api.controller;

import kodlamaio.nortwind.business.abstracts.ProductService;
import kodlamaio.nortwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getall")
    public List<Product> getAll(){
        return this.productService.getAll();

    }
}

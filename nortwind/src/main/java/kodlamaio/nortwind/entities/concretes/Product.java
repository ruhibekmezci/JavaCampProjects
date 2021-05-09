package kodlamaio.nortwind.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity//persistance
@Table(name="products")//persistance
public class Product {

    @Id//persistance
    @GeneratedValue//persistance
    @Column(name = "product_id")//persistance
    private int id;

    @Column(name = "category_id")//persistance
    private int categoryId;

    @Column(name = "product_name")//persistance
    private String productName;

    @Column(name = "unit_price")//persistance
    private double unitPrice;

    @Column(name = "units_in_stock")//persistance
    private short unitsInStock;

    @Column(name = "quantity_per_unit")//persistance
    private String quantityPerUnit;

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public Product() {

    }
}

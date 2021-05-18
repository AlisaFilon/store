package group.store.controllers;

import group.store.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;*/


@RestController
public class ProductController {
    private final List<Product> products;

    public ProductController() {
        products = new ArrayList<>();
    }

    @GetMapping("/products")
    public List<Product> allProducts() {
        return products;
    }

    @PostMapping("/products")
    public void addProduct(Product product) {
        products.add(product);
    }

    @DeleteMapping("/products")
    public Product findProduct(String name, List<Product> products) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;

    }
    @DeleteMapping("/product/{name}")
    public String removeProduct(@PathVariable String name){
        products.remove(products);
        return name;
    }
}




package group.store.controllers;

import group.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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


}

   /* @DeleteMapping("/product/{name}")
    public String removeProduct(@PathVariable String name)
        return"deleted!";*/



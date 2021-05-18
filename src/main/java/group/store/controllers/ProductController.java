package group.store.controllers;

import group.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;*/


@RestController
public class ProductController {
    @GetMapping("/health")
    public String check() {
        return "Hello! I'm a server.";
    }

    public List<Product> products = new ArrayList<>();
    @GetMapping("/products")
    public List<Product> allProducts() {
        return products;

   /* @DeleteMapping("/product/{name}")
    public String removeProduct(@PathVariable String name)
        return"deleted!";*/
    }

}


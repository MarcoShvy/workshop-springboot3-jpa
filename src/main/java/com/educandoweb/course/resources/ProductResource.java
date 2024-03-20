package com.educandoweb.course.resources;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productsService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productsService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productsService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

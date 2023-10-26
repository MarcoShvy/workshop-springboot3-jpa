package com.educandoweb.course.resources;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.entites.Products;
import com.educandoweb.course.service.ProductService;
import com.educandoweb.course.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productsService;
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productsService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productsService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

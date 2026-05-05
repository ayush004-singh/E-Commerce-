package com.ECommerce.Backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class Controller {
    @Autowired
    private ServiceImpl service;
    // private List<product> products = new ArrayList<>();

    @GetMapping
    public List<product> getAllProducts(){
        return service.getAllProducts();
    }

    

    @PostMapping
    public void addProduct(@RequestBody product newProduct){
        service.addProduct(newProduct);
    }



    @GetMapping("/{id}")
    public product getProductById(@PathVariable int id){
       return service.getProductById(id);
    }
    

    @PutMapping("path/{id}")        
    public void putMethodName(@PathVariable int id, @RequestBody product entity) {
        service.updateProduct(id, entity);
    }

    @DeleteMapping("{/id}")
    public void deleteMethodName(@PathVariable int id) {
        service.removeProduct(id);
    }



}

package com.ECommerce.Backend;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Services {

    private final List<product> products=new ArrayList<>();
    @Override
    public List<product> getAllProducts() {
        
        return products;
    }

    @Override
    public product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addProduct(product product) {
        if(products.contains(product)){
            throw new IllegalArgumentException("Product with id "+product.getId()+" already exists.");
        }
        else{
            products.add(product);        
        }
    }

    @Override
    public void removeProduct(int id) {
        product productToRemove = null;
        for(product p : products){
            if(p.getId() == id){
                productToRemove = p;
                break;
            }
        }
        if(productToRemove == null){
            throw new IllegalArgumentException("Product with id "+id+" does not exist.");
        }
        else{
            products.remove(productToRemove);        
        }
       
    }


    @Override
    public void updateProduct(int id, product updatedProduct) {
        product productToUpdate = null;
        for(product p : products){
            if(p.getId() == id){
                productToUpdate = p;
                break;
            }
        }
        if(productToUpdate == null){
            throw new IllegalArgumentException("Product with id "+id+" does not exist.");
        }
        else{
            products.remove(productToUpdate);        
            products.add(updatedProduct);
        }
    }
    
}

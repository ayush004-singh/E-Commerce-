package com.ECommerce.Backend;
import java.util.List;
public interface Services {
    List<product> getAllProducts();
    product getProductById(int id);
    public void addProduct(product product);
    public void removeProduct(int id);
    public void updateProduct(int id, product updatedProduct);

}

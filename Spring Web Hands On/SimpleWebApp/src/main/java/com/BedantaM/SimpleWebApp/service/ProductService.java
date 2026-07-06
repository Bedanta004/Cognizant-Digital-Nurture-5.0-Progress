package com.BedantaM.SimpleWebApp.service;

import com.BedantaM.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Samsung", 80000),
            new Product(102, "Cannon Camera", 60000),
            new Product(103, "Luminious", 12980000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream().
                filter(p-> p.getProdId() == prodId)
                .findFirst().orElse(new Product(0, "No Itme Found", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProdId() == prod.getProdId())
                index = i;

        products.set(index, prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0; i<products.size(); i++)
            if(products.get(i).getProdId() == prodId)
                index = i;

        products.remove(index);
    }
}

package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Product;
import edu.sabanciuniv.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public void addProduct (Product product)
    {
        productRepository.save(product);
        System.out.println("Product added:" + product.getName());
        productRepository.save(product);
    }


}

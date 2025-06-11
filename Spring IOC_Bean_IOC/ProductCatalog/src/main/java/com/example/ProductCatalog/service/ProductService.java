package com.example.ProductCatalog.service;

import com.example.ProductCatalog.exception.CategoryNotFoundException;
import com.example.ProductCatalog.exception.SearchIdNotFoundException;
import com.example.ProductCatalog.model.Product;
import com.example.ProductCatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getByCategory(String category){
        List<Product> products = productRepository.findByCategory(category);
        if (products.isEmpty()){
            throw new CategoryNotFoundException(category);
        };
        return products;
    }

    //Optional Methods
    public Product getByID(Integer id){
        return productRepository.findById(id)
                .orElseThrow(()-> new SearchIdNotFoundException(id));
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}

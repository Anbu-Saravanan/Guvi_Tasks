package com.example.ProductCatalog.exception;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(String category) {
        super("No product found in category "+ category);
    }
}

package com.example.ProductCatalog.exception;

public class SearchIdNotFoundException extends RuntimeException{
    public SearchIdNotFoundException(Integer id) {
        super("Your product's ID: "+id+" doesn't exist");
    }
}

package com.example.ProductCatalog.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionalHandler {
    @ExceptionHandler(CategoryNotFoundException.class)
    public String handleCategoryNotFound(CategoryNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "errorPage"; // This is a Thymeleaf page that you will create next
    }
    @ExceptionHandler(SearchIdNotFoundException.class)
    public String handleIdNotFound(SearchIdNotFoundException e,Model model){
        model.addAttribute("idError",e.getMessage());
        return "errorPage";
    }

}

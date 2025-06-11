package com.example.ProductCatalog.controller;

import com.example.ProductCatalog.model.Product;
import com.example.ProductCatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("add")
    public String showAddForm(Model model){
        model.addAttribute("product",new Product());
        return "addProduct";
    }

    @PostMapping("save")
    public String saveProduct(@ModelAttribute Product product){
        productService.saveProduct(product);
        return "redirect:/add";
    }

    @GetMapping("display")
    public String getAllProducts(Model model){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("productList",productList);
        return "displayProduct";
    }


    @GetMapping("category")
    public String getByCategory(@RequestParam String category, Model model){
        List<Product> filtered = productService.getByCategory(category);
        model.addAttribute("products",filtered);
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("productList",productList);
        return "displayProduct";
    }

    @GetMapping("findById")
    public String findByID(@RequestParam("id") Integer id,Model model){
        Product product = productService.getByID(id);
        List<Product> products = new ArrayList<>();
        if (product != null){
            products.add(product);
        }
        model.addAttribute("productFindId",products);
        model.addAttribute("productList",productService.getAllProducts());

        return "displayProduct";

    }

    @GetMapping("edit/{id}")
    public String editForm(@PathVariable Integer id, Model model){
        Product product = productService.getByID(id);
        model.addAttribute("editProduct", product);
        return "editProduct";
    }

    @PostMapping("update")
    public String updateProduct(@ModelAttribute Product product){
        productService.saveProduct(product);
        return "redirect:/display";
    }

    //Optional
    @GetMapping("delete/{id}")
    public String deleteProductById(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
        return "redirect:/display";
    }
}

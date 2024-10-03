package com.idm3.CRUDExample.controllers;

import com.idm3.CRUDExample.model.Product;
import com.idm3.CRUDExample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Controller()
@RequestMapping(value = {"/product", "/product/"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value ={"/allProducts",""})
    public ModelAndView displayAllProducts() {
        return new ModelAndView("/viewAll", "products", productService.findAll());
    }
    @GetMapping("/add")
    public ModelAndView showAddProductForm() {
        return new ModelAndView("/addProduct", "newProduct", new Product());

    }

    @PostMapping("/delete")
    public ModelAndView deleteBook(@RequestParam("productId")  long id) {
        if (productService.findOne(id).isEmpty()) {
            return new ModelAndView("/error", "error", "Product not found");
        }
        else {
            productService.deleteByID(id);
            return new ModelAndView("redirect:/product/");
        }
    }

    @PostMapping("/addProduct")
    public ModelAndView addABook(@ModelAttribute("newProduct") Product x, BindingResult result) {
        //if (result.hasErrors())
           // return new ModelAndView("/addBook");
        productService.saveProduct(x);
        return new ModelAndView("redirect:/product");

    }

}
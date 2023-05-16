package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Product")
public class ProductController {

    @RequestMapping(value={"/create","Create"})
    public String creteProduct(){
        return "Product created succefully";
    }

    @RequestMapping(value={"/update","Update"})
    public String updateProduct(){
        return "Product updated succefully";
    }

    @RequestMapping(value={"/delete","/Delete"})
    public String deleteProduct(){
        return "Product deleted succefully";
    }

    @RequestMapping(value={"/getProduct","/GetProduct","/getproduct"})
    public String getProduct(){
        return "Product details fetched succefully";
    }
}

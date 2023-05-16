package com.example.demo.controller;

import lombok.extern.slf4j.XSlf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
@RequestMapping(value = {"/Customer","/customer"})
public class Customer {

    private Logger logger = LoggerFactory.getLogger(Customer.class);
    @RequestMapping(value = "/create")
    public String createCustomer(){
        return "customer created succesfully";
    }

    @RequestMapping(value = "/update")
    public String updateCustomer(){
        return "customer updated succesfully";
    }

    @RequestMapping(value = "/delete")
    public String deleteCustomer(){
        return "customer deleted succesfully";
    }

    @RequestMapping(value = "/get")
    public String getCustomerDetails(){
        return "customer details fetched succesfully";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("name","areeb");
        model.addAttribute("currentdate",new Date());
        return "about";
    }
}

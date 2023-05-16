package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/Payment","/payment"})
public class PaymentController {

    @RequestMapping(value = "/create")
    public String createPayment(){
        return "payment done succesfully";
    }

    @RequestMapping(value = "/update")
    public String updatePayment(){
        return "payment updated succesfully";
    }
    @RequestMapping(value = "/get")
    public String getPaymentDetails(){
        return "payment details fetched succesfully";
    }
}

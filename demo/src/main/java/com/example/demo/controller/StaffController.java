package com.example.demo.controller;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService)
    {
        this.staffService=staffService;
    }

    @GetMapping(value="/staff")
    public List<Staff> getDetails( ){
        /*model.addAttribute("staff",staffService.getDetails());
        return "static";*/
        return staffService.getDetails();
    }
}

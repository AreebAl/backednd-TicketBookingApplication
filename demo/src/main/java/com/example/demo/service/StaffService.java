package com.example.demo.service;

import com.example.demo.model.Staff;
import com.example.demo.model.position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<Staff> staff=new ArrayList<>();

    static{
       staff.add(new Staff(UUID.randomUUID().toString(),"abcd","abcd", position.FRONTDESK));
        staff.add(new Staff(UUID.randomUUID().toString(),"XYZ","XYZ", position.SECURITY));
    }


    public List<Staff> getDetails(){
        return staff;
    }
}

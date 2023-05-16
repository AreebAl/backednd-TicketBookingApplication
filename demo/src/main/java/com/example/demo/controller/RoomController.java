package com.example.demo.controller;

import com.example.demo.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/room")
public class RoomController {
    private static final List<Room> room=new ArrayList();
    static{
        for(int i=0;i<10;i++){
           room.add(new Room(i,"R"+i,"Room"+i,"Q"));
        }
    }

    @GetMapping(value = "/rooms")
    public String getRoomDetails(Model model){
        model.addAttribute("rooms",room);
        return "about";
    }

}

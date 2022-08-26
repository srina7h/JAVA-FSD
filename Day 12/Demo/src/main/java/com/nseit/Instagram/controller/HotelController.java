package com.nseit.Instagram.controller;

import com.nseit.Instagram.model.Hotel;
import com.nseit.Instagram.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public void add(@RequestBody Hotel hotel){
        hotelService.add(hotel);

    }
    @GetMapping("/all")
    public List<Hotel> view(){
        return hotelService.view();

    }
    @PutMapping
    public void update(@RequestBody Hotel hotel){
        hotelService.update(hotel);

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        hotelService.delete(id);
    }
}

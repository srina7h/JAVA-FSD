package com.nseit.Instagram.service;


import com.nseit.Instagram.model.Hotel;
import com.nseit.Instagram.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public void add(Hotel hotel) {
        hotelRepository.save(hotel);

    }

    public void update(Hotel hotel) {
        hotelRepository.save(hotel);

    }

    public List<Hotel> view() {
        return hotelRepository.findAll();

    }

    public void delete(Integer id) {
        for (Hotel hotel : hotelRepository.findAll()) {
            if (id == hotel.getId()) {
                hotelRepository.delete(hotel);
            }
        }

    }
}

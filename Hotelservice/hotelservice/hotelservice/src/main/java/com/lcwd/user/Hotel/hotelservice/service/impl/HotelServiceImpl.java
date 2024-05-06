package com.lcwd.user.Hotel.hotelservice.service.impl;

import com.lcwd.user.Hotel.hotelservice.entity.Hotel;
import com.lcwd.user.Hotel.hotelservice.exceptation.ResourseNotFoundException;
import com.lcwd.user.Hotel.hotelservice.repository.HotelRepository;
import com.lcwd.user.Hotel.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()->
                new ResourseNotFoundException("hotel given id not found!!"));

    }
}

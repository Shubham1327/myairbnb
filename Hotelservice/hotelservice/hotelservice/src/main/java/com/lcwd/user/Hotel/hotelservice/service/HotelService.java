package com.lcwd.user.Hotel.hotelservice.service;

import com.lcwd.user.Hotel.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    //create

    Hotel create(Hotel hotel);
    //getAll
    List<Hotel> getAll();
    // getSingle
    Hotel get(String id);
}

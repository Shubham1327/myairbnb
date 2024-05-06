package com.lcwd.user.Hotel.hotelservice.repository;

import com.lcwd.user.Hotel.hotelservice.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}

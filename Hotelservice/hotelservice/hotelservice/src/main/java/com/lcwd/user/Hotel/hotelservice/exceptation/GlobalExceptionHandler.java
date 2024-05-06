package com.lcwd.user.Hotel.hotelservice.exceptation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler extends ResourseNotFoundException{
    @ExceptionHandler(ResourseNotFoundException.class)
    public ResponseEntity<Map<String, Object>> notFoundHandler(ResourseNotFoundException s ){
        Map map = new HashMap<>();
        map.put("messgae",s.getMessage());
        map.put("success", false);
        map.put("status", HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

    }


}

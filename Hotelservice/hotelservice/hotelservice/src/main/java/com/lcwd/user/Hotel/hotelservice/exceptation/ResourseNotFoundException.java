package com.lcwd.user.Hotel.hotelservice.exceptation;

public class ResourseNotFoundException extends RuntimeException {
    public ResourseNotFoundException(String s) {
        super(s);
    }
    public ResourseNotFoundException(){
        super("Request not found excepation");
    }
}

package com.bookingmanager.springbootmicroservice.entity;

import lombok.Data;

@Data
public class Order extends Thread {

    private String guestName;
    private String roomNumber;
    private int date;
    private Room room;

}


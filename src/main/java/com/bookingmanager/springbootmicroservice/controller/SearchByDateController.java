package com.bookingmanager.springbootmicroservice.controller;

import com.bookingmanager.springbootmicroservice.entity.Room;
import com.bookingmanager.springbootmicroservice.service.SearchByDateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class SearchByDateController {
    @Resource
    private SearchByDateService searchByDateService;

    @GetMapping( "/searchByDate")
    public ArrayList<Room> searchByDate(@RequestParam int date){
        return searchByDateService.searchByDate(date);
    }

}

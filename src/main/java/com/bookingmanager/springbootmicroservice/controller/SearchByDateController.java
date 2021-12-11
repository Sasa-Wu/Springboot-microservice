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

    @GetMapping( "/searchByDate/{date}")
    public ArrayList<Room> searchByDate(@PathVariable("date") int date){
        // url http://localhost:8080/api/searchByDate/20100115
        return searchByDateService.searchByDate(date);
    }

}

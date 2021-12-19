package com.bookingmanager.springbootmicroservice.controller;

import com.bookingmanager.springbootmicroservice.entity.Room;
import com.bookingmanager.springbootmicroservice.service.SearchByDateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Slf4j
public class SearchByDateController {
    @Resource
    private SearchByDateService searchByDateService;

    @GetMapping( "/searchByDate/{date}")
    public ArrayList<Room> searchByDate(@PathVariable("date") int date){
        log.info("Inside the method of searchByDate controller");
        // url http://localhost:8080/api/searchByDate/20100115
        return searchByDateService.searchByDate(date);
    }

}

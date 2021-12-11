package com.bookingmanager.springbootmicroservice.controller;

import com.bookingmanager.springbootmicroservice.entity.Room;
import com.bookingmanager.springbootmicroservice.service.SearchByNameService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class SearchByNameController {
    @Resource
    private SearchByNameService searchByNameService;

    @GetMapping( "/searchByName/{name}")
    public ArrayList<Room> searchByDate(@PathVariable("name") String name){
        // url http://localhost:8080/api/searchByName/Jeff
        return searchByNameService.searchByName(name);
    }

}

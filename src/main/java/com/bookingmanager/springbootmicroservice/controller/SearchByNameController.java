package com.bookingmanager.springbootmicroservice.controller;

import com.bookingmanager.springbootmicroservice.entity.Room;
import com.bookingmanager.springbootmicroservice.service.SearchByNameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Slf4j
public class SearchByNameController {
    @Resource
    private SearchByNameService searchByNameService;

    @GetMapping( "/searchByName/{name}")
    public ArrayList<Room> searchByDate(@PathVariable("name") String name){
        log.info("Inside the searchByName method of controller");
        // url http://localhost:8080/api/searchByName/Jeff
        return searchByNameService.searchByName(name);
    }

}

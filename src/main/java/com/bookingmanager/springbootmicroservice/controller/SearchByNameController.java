package com.bookingmanager.springbootmicroservice.controller;

import com.bookingmanager.springbootmicroservice.entity.Room;
import com.bookingmanager.springbootmicroservice.service.SearchByNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class SearchByNameController {
    @Resource
    private SearchByNameService searchByNameService;

    @GetMapping( "/searchByName")
    public ArrayList<Room> searchByDate(@RequestParam String name){

        return searchByNameService.searchByName(name);
    }

}

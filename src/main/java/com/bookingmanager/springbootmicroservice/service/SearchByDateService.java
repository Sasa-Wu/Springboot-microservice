package com.bookingmanager.springbootmicroservice.service;

import com.bookingmanager.springbootmicroservice.common.ConfigureRooms;
import com.bookingmanager.springbootmicroservice.common.ErrorMessage;
import com.bookingmanager.springbootmicroservice.entity.Room;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class SearchByDateService {
    public ArrayList<Room> searchByDate(int queryDate){
        ConfigureRooms configureRooms = new ConfigureRooms();
        ArrayList<Room> totalrooms = configureRooms.configureRooms();
        ArrayList<Room> availableRooms = new ArrayList<>();
        if(queryDate==0){
            ErrorMessage errorMessage = ErrorMessage.DATE_ERROR;
            log.error("状态码：" + errorMessage.code() +
                    " 状态信息：" + errorMessage.msg());
            return availableRooms;
        }
        if (!totalrooms.isEmpty()){
            for (Room room: totalrooms) {
                if (room.getAvailableDateFrom() <= queryDate &&
                        room.getAvailableDateTo() >= queryDate){
                    availableRooms.add(room);
                }
            }
        }
        return availableRooms;
    }
}

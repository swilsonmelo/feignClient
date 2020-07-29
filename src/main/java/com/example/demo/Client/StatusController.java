package com.example.demo.Client;


import com.example.demo.Server.SpaceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StatusController {

    private final SpaceStationClient spaceStationClient;

    @Autowired
    public StatusController(SpaceStationClient spaceStationClient) {
        this.spaceStationClient = spaceStationClient;
    }

    @GetMapping("/status")
    public SpaceStation status(){
        return spaceStationClient.findSpaceStation(new Random().nextInt());
    }
}

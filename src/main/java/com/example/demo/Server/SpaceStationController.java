package com.example.demo.Server;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SpaceStationController {

    @GetMapping("/station/{stationId}")
    public SpaceStation getSpaceStation(@PathVariable Integer stationId){

        return new SpaceStation(
                stationId,
                "my huge SpaceStation",
                new Random().nextInt(),
                new Random().nextInt()
        );

    }


}

package com.example.demo.Client;

import com.example.demo.Server.SpaceStation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( value="spacestation", url="http://localhost:8080" )
public interface SpaceStationClient {

    @RequestMapping(value = "/station/{stationId}", method = RequestMethod.GET)
    SpaceStation findSpaceStation(@PathVariable Integer stationId);

}

package com.example.demo.Server;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceStation {

    private Integer stationId;
    private String name;
    private int people;
    private int diameter;


}

package com.randy.charpter3.charpter3p5;

import org.springframework.beans.factory.annotation.Value;

public class FootballPlayer {

    @Value("${footballPlayer.name}")
    private String name;

    @Value("${footballPlayer.age}")
    private String age;

    public void introduce() {
        System.out.println("hello,my name is " + name + " and my age is " + age);
    }

}

package com.Introtospringframeworkexample.Springframework_1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatapple(){
        System.out.println("I am Eating an apple!");
    }

    @PostConstruct
    void callbeforeAppleisIssued(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callbeforedestroy(){
        System.out.println("Destroying the Apple bean");
    }
}

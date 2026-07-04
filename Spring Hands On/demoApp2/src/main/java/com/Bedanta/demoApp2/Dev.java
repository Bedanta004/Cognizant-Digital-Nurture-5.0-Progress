package com.Bedanta.demoApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {

//    @Autowired //field injection
    private Computer comp;

//    Constructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();
//        debug();

        System.out.println("Working on Awsome Project");
    }
}

package org.example;

public class Dev {
//    private Laptop laptop;
    private int age;
    public Dev(){
        System.out.println("Dev Constructor");
    }

//    for the constructor-arg in xml
    public Dev(int age){
        this.age=age;
        System.out.println("Dev 1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){

        System.out.println("Working on Awsome Project");
//        laptop.compile();
    }
}

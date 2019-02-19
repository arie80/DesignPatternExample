package com.arie80.practice.abstractfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }

}

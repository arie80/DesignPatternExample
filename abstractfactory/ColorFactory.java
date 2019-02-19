package com.arie80.practice.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        Color obj = null;
        switch(color.toLowerCase()) {
            case "red":
                obj = new Red();
                break;
            case "green":
                obj = new Green();
                break;
        }
        return obj;
    }

    @Override
    Shape getShape(String shape) {
        // TODO Auto-generated method stub
        return null;
    }

}

package com.arie80.practice.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    Shape getShape(String shape) {
        Shape obj = null;
        switch (shape.toLowerCase()) {
            case "rectangle":
                obj = new Rectangle();
                break;
            case "square":
                obj = new Square();
                break;
        }
        return obj;
    }
}

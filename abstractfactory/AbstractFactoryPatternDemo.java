package com.arie80.practice.abstractfactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShape("Rectangle");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
        Color color1 = colorFactory.getColor("green");
        color1.fill();
    }
}

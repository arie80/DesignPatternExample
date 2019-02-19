package com.arie80.practice.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory (String choice) {
        AbstractFactory obj = null;
        if (choice.equalsIgnoreCase("shape")) {
            obj = new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            obj = new ColorFactory();
        }
        return obj;
    }
}

package org.example.factory.baddesign;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle circle = (Circle) shapeFactory.createShape("Circle");
        circle.draw();

        Rectangle rectangle = (Rectangle) shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
